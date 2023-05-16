package com.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class SearchDTO {
	private String criteria;
	private String keyword;
	
}
