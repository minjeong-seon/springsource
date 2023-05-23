package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.SampleDTO;

@RestController
public class RestControllerTest {
	// 일반 컨트롤러에서 return 값 == view(.jsp == 경로)의 이름(화면에 리턴값에 있는 경로 페이지 보여줌)
	// Rest 컨트롤러에서 return 값 == 데이터 그 자체(화면에 리턴값 데이터를 보여줌)
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
	//produces : 리턴값을 json 형태로 보냄
	//자바 객체 ==> json 형태로 변환해주는 라이브러리(jackson-databind) 필요
	@GetMapping(value="/send", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleDTO sendDto() {
		return new SampleDTO("1234","김","나리");
	}
	
	@GetMapping(value="/listmember", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SampleDTO> sendList() {
		List<SampleDTO> list = new ArrayList<>();
		list.add(new SampleDTO("1234","김","나리"));
		list.add(new SampleDTO("1235","박","나리"));
		list.add(new SampleDTO("1236","이","나리"));
		list.add(new SampleDTO("1237","최","나리"));
		return list;
	}
	
	// ResponseEntity : 상태코드(200,400,500)와 데이터 같이 전송
	@GetMapping(value="/check", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SampleDTO> check(double height, double weight) {
		
		SampleDTO dto = new SampleDTO("1234","" + height, "" + weight);
		
		ResponseEntity<SampleDTO> entity = null;
		
		if(height < 160) {
			//height가 160미만이면 상태코드 400(BAD_REQUEST)
			entity = new ResponseEntity<SampleDTO>(dto, HttpStatus.BAD_REQUEST);
		}else {
			//height가 160이상이면 상태코드 200(OK)
			entity = new ResponseEntity<SampleDTO>(dto, HttpStatus.OK);
		}
		return entity;
	}
	
	//경로(url)에 있는 특정 값을 사용하고 싶을 때
	// ex) localhost:8080/product/bags/1001 요청 :  bags(카테고리명), 1001(상품ID)으로
	@GetMapping("/product/{cat}/{pid")
	public String[] getPath(@PathVariable("cat") String cat, @PathVariable("pid")  String pid) {
		return new String[] {
				"category" + cat,
				"productId" + pid
		};
	}
	
}
