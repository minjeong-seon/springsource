package com.spring.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.spring.domain.FileDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@GetMapping("/uploadForm")
	public void uploadGet() {
		logger.info("업로드 폼 요청");	
	}
	
	//파일 하나만 업로드 할 때
//	@PostMapping("/uploadForm")
//	public void uploadPost(FileDTO dto) {
//		logger.info("업로드 요청.."+dto);	
//		
//		logger.info("File Name : "+dto.getFile().getOriginalFilename());
//		logger.info("Content Type : "+dto.getFile().getContentType());
//		logger.info("File Size : "+dto.getFile().getSize());
//		
//		String uploadPath = "C:\\upload";
//		File saveFile = new File(uploadPath, dto.getFile().getOriginalFilename());
//		
//		try {
//			//지정한 경로에 파일 저장
//			dto.getFile().transferTo(saveFile);
//		} catch (IllegalStateException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	//첨부 파일이 여러개일 때
	@PostMapping("/uploadForm")
	public void uploadPost(FileDTO dto) {
		logger.info("업로드 요청.."+dto);	
		
		String uploadPath = "C:\\upload";
		for (MultipartFile multipartFile : dto.getFile()) {
			logger.info("File Name : "+multipartFile.getOriginalFilename());
			logger.info("Content Type : "+multipartFile.getContentType());
			logger.info("File Size : "+multipartFile.getSize());

			UUID uuid = UUID.randomUUID();
			String fileName = uuid.toString() + "_" + multipartFile.getOriginalFilename();
			
			File saveFile = new File(uploadPath, fileName);
			
			try {
				//지정한 경로에 파일 저장
				multipartFile.transferTo(saveFile);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
