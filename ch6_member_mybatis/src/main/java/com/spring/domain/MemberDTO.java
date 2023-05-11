package com.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor@NoArgsConstructor
@ToString @Setter @Getter
public class MemberDTO {
	private String userid;
	private String name;
	private String password;
	private String gender;
	private String email;

}
