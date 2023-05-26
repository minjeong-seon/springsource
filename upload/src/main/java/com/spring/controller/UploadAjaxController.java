package com.spring.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.spring.domain.AttachFileDTO;

import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.util.BufferedImages;

@Slf4j
@Controller
public class UploadAjaxController {
	
	//uploadAjax 보여주는 컨트롤러
	@GetMapping("/uploadAjax")
	public void uploadAjaxGet() {
		log.info("uploadAjax 페이지..");
	}
	
//	@PostMapping("/uploadAjax")
//	public ResponseEntity<String> uploadAjaxPost(MultipartFile uploadFile) {
//		log.info("uplaod 요청");
//		
//		log.info("file name: "+uploadFile.getOriginalFilename());
//		log.info("file size: "+uploadFile.getSize());
//		
//		String uploadPath = "c:\\upload";
//		UUID uuid = UUID.randomUUID();
//		String fileName = uuid.toString() + "_" + uploadFile.getOriginalFilename();
//		
//		try {
//			uploadFile.transferTo(new File(uploadPath, fileName));
//		} catch (IllegalStateException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		//상태코드 + 메시지
//		return new ResponseEntity<>(fileName, HttpStatus.OK);
//	}
	
	@PostMapping("/uploadAjax")
	public ResponseEntity<List<AttachFileDTO>> uploadAjaxPost(MultipartFile[] uploadFile) {
		log.info("uplaod 요청");
		
		List<AttachFileDTO> fileList = new ArrayList<AttachFileDTO>();
		
		String uploadPath = "c:\\upload";
		
		//폴더 생성 => c:\\upload\\2023\\05\\26
		String uploadFolderPath = getFolder();
		log.info("생성된 폴더명 : " + uploadFolderPath);
		
		File uploadFullPath = new File(uploadPath,uploadFolderPath);
		
		//uploadPath 경로에 uploadFolderPath 폴더가 존재하지 않는 경우 폴더 생성(mkdirs : make directories)
		if(!uploadFullPath.exists()) {
			uploadFullPath.mkdirs();
		}
		
		for (MultipartFile multipartFile : uploadFile) {
			log.info("file name: "+multipartFile.getOriginalFilename());
			log.info("file size: "+multipartFile.getSize());
			
			UUID uuid = UUID.randomUUID();
			String fileName = uuid.toString() + "_" + multipartFile.getOriginalFilename();
			
			File saveFile = new File(uploadFullPath, fileName);
			
			//파일 한 개당 AttachFileDTO 생성
			AttachFileDTO attach = new AttachFileDTO();
			attach.setFileName(multipartFile.getOriginalFilename());
			attach.setUploadPath(uploadFolderPath);
			attach.setUuid(uuid.toString());
			
			try {
				//원본 파일 저장
				multipartFile.transferTo(saveFile);
				
				//업로드된 파일 타입(확장자) 확인
				if(checkImageType(saveFile)) {
					attach.setFileType(true);
					
					//이미지 파일 : 썸네일 이미지로 저장(원본 1, 썸네일 이미지 1 각각 저장)
					//원본 이미지 읽어오기
					BufferedImage origin = ImageIO.read(saveFile);
					
					//썸네일 파일명은 원본파일명과 다르게 저장해야 하므로 "s_"를 붙임 
					File thumbnail = new File(uploadFullPath, "s_"+fileName);
					
					double ratio = 50;	//축소 비율
					int width = (int)(origin.getWidth() / ratio);
					int height = (int)(origin.getHeight() / ratio);
					
					Thumbnails.of(origin).size(width,height).toFile(thumbnail);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			fileList.add(attach);
		}
		
		//상태코드 + 메시지
		return new ResponseEntity<>(fileList, HttpStatus.OK);
	}
	
	//파일 요청 시 파일 보내주기
	@GetMapping("/display")
	public ResponseEntity<byte[]> getFile(String fileName) {
		log.info("파일 요청"+fileName);
		
		File file = new File("c:\\upload\\"+fileName);
		
		//springframework HttpHeaders임
		HttpHeaders headers = new HttpHeaders();
		ResponseEntity<byte[]> result = null;
		
		try {
			//서버가 보내는 파일에 대한 타입(확장자) 지정
			headers.add("content-type", Files.probeContentType(file.toPath()));
			result = new ResponseEntity<byte[]>(FileCopyUtils.copyToByteArray(file), HttpStatus.OK);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@GetMapping(value="/download", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public ResponseEntity<Resource> downloadFile(String fileName, String userAgent){
		log.info("파일 다운로드 요청 "+fileName);
		
		Resource resource = new FileSystemResource("c:\\upload\\"+fileName);
		
		if(!resource.exists()) {
			return new ResponseEntity<Resource>(HttpStatus.NOT_FOUND);
		}
		
		HttpHeaders headers = new HttpHeaders();
		
		String downloadName = null;
			try {
				if(userAgent.contains("Trident") || userAgent.contains("Edge")) {
					downloadName = URLEncoder.encode(resource.getFilename(), "utf-8").replaceAll("\\+", " ");
					}else {
						downloadName = new String(resource.getFilename().getBytes("utf-8"), "ISO-8859-1");
					}
				
				headers.add("content-type", "attachment;fileName="+downloadName);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				}
		return new ResponseEntity<Resource>(resource, headers, HttpStatus.OK);
	}
	
//-----------------------------------------------------------------------------------------------------------------------------
	
	
	//일반 메소드(파일 타입 확인)
	private boolean checkImageType(File file) {
		String contentType;
		try {
			//이미지 파일은 true, 텍스트 파일은 false
			contentType = Files.probeContentType(file.toPath());	// ex)  image/gif, image/jpg
			return contentType.startsWith("image");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//일반 메소드(폴더 생성)
	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = new Date();
		String str = sdf.format(date);
		return str.replace("-", File.separator);
	}
	
	
	
	
}
