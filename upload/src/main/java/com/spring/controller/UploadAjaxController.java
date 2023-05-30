package com.spring.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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
import org.springframework.web.bind.annotation.RequestHeader;
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
					
					double ratio = 5;	//축소 비율
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
	
	//다운로드
	//HttpServletRequest 객체 : 클라이언트 정보를 가져올 수 있음
	@GetMapping(value="/download", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public ResponseEntity<Resource> downloadFile(String fileName, @RequestHeader("User-Agent") String userAgent){
		log.info("파일 다운로드 요청 "+fileName);
		
		//c:\\20232023\\05\\30\5Cc013c2a7-1201-4667-aaec-22daea28a51d_dd.txt
		Resource resource = new FileSystemResource("c:\\upload\\"+fileName);
		
		//uuid 포함 파일명
		String oriFileName = resource.getFilename();
		//위 파일명을 '_'에서 잘라내기(==파일명에서 uuid 제거)
		String splitUuid = resource.getFilename().substring(oriFileName.indexOf("_")+1);
				
		if(!resource.exists()) {
			return new ResponseEntity<Resource>(HttpStatus.NOT_FOUND);
		}
		
		HttpHeaders headers = new HttpHeaders();
		
		String downloadName = null;
			try {
				//ms계열 : Trident (IE 11), Edge 로 들어오는 userAgent 정보는 파일 다운로드 시 파일명 "\\"은 공백으로 표시
				if(userAgent.contains("Trident") || userAgent.contains("Edge")) {
					//uuid 포함한 파일명 처리할 때
					//downloadName = URLEncoder.encode(resource.getFilename(), "utf-8").replaceAll("\\+", " ");
					
					//원본 파일명 처리할 때
					downloadName = URLEncoder.encode(splitUuid, "utf-8").replaceAll("\\+", " ");
					}else {
						//downloadName = new String(resource.getFilename().getBytes("utf-8"), "ISO-8859-1");
						downloadName = new String(splitUuid.getBytes("utf-8"), "ISO-8859-1");
					}
				
				//파일을 헤더에 덧붙이기**
				headers.add("Content-Disposition", "attachment;filename="+downloadName);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				}
		return new ResponseEntity<Resource>(resource, headers, HttpStatus.OK);
	}
	
	@PostMapping("/deleteFile")
	public ResponseEntity<String> deleteFile(String fileName, String type){
		log.info("파일 제거 요청 "+fileName+", type"+type);
		//특수문자 인코딩이 일어남 ==> 경로에 있는 \가 %5C로 인코딩 됨
		//2023%5C05%5C30%5C7c2796cd-41ca-406c-bae7-f67a67236883_tomato.jpg
		
		try {
			File file = new File("c:\\upload\\", URLDecoder.decode(fileName, "utf-8"));
			
			//이미지 파일: 원본, 썸네일 삭제
			//txt 파일: 파일 제거
			
			//파일 삭제 : txt 파일, 썸네일 삭제
			file.delete();
			
			//원본 이미지 제거
			if(type.equals("image")) {
				//위의 file 객체에서 fileName 추출 후 's_' 를 제거한 상태의 이름을 파일 객체로 생성 후 삭제
				String orgName = file.getAbsolutePath().replace("s_", "");
				file = new File(orgName);
				file.delete();
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<String>("success",HttpStatus.OK);
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
