package com.spring.memo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
@Builder		// Memo entity 클래스에서 @Builder 어노테이션 사용 시 set, get 생략 가능
@Entity	// 클래스를 엔티티로 선언
@SequenceGenerator(name = "mem_seq_gen", sequenceName = "mem_seq", allocationSize = 1)
public class Memo {
	
	// name = 임의로 설정(필수) , sequenceName = mem_seq.nextval에 써먹을 시퀀스이름, allocationSize = 시퀀스 몇 씩 증가할 것인지 설정(default: 50)
	// @SequenceGenerator(name = "mem_seq_gen", sequenceName = "mem_seq", allocationSize = 1)
	
	
	// GenerationType
	//		1) AUTO : JPA 구현체가 자동으로 구현
	//		2) IDENTITY : 기본키 생성을 디비에 위임
	//		3) SEQUENCE : @SequenceGenerator 등록 후 사용
	//		4) TABLE : 키 생성용 테이블 사용 @TableGenerator 사용
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mem_seq_gen")	// 시퀀스 생성
	@Id		// pk 생성
	private Long mno;
	@Column(length = 200, nullable = false)		//속성 추가
	private String memoText;
	
	
	
	
	
	
}
