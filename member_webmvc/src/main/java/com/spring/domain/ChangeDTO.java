package com.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor @Setter @Getter @ToString
public class ChangeDTO {
	private String userid;
	private String currPassword;
	private String cngPassword;
	private String confirmPassword;
	
	public boolean passwordEquals() {
		return cngPassword.equals(confirmPassword);
	}
}
