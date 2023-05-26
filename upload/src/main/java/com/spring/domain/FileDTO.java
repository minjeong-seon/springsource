package com.spring.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class FileDTO {
	private String name;
	//file 요소 처리 : MultipartFile(인터페이스) 타입으로 생성해야 함!!
	private MultipartFile[] file;
	
}
