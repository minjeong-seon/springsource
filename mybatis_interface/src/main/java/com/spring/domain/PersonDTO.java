package com.spring.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class PersonDTO {
	private String id;
	private String name;
}
