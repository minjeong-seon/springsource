package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.Criteria;
import com.spring.domain.ReplyDTO;
import com.spring.domain.ReplyPageDTO;
import com.spring.service.ReplyService;

import lombok.extern.slf4j.Slf4j;

//http://localhost:8080/replies
@Slf4j
@RestController
@RequestMapping("/replies")
public class ReplyController {
	
	@Autowired
	private ReplyService reService;
	
	//http://localhost:8080/replies/1 + GET : 1번 댓글 데이터 가져오기
	@GetMapping(value="/{rno}")
	public ResponseEntity<ReplyDTO> get(@PathVariable("rno") int rno){
		log.info("댓글 조회"+rno);
		
		return new ResponseEntity<ReplyDTO>(reService.read(rno), HttpStatus.OK);
	}
	
	// http://localhost:8080/replies/new + POST + 입력데이터(json) = @RequestBody(json >> java코드) 필요
	@PostMapping("/new")
	public ResponseEntity<String> insert(@RequestBody ReplyDTO dto){
		log.info("댓글 등록" + dto);
		
		return reService.insertReply(dto)?
				new ResponseEntity<String>("success", HttpStatus.OK) :
				new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	// http://localhost:8080/replies/pages/{bno}/ + GET = @PathVariable(링크에 있는 데이터를 변수에 받음) 필요
	@GetMapping("/pages/{bno}/{page}")
	public ResponseEntity<ReplyPageDTO> list(@PathVariable("bno") int bno, @PathVariable("page") int page){
		log.info("댓글 전체 가져오기"+bno);
		
		Criteria cri = new Criteria(page, 10);
		return new ResponseEntity<ReplyPageDTO>(reService.getList(cri, bno), HttpStatus.OK);
	}
	
	
	// http://localhost:8080/replies/rno + PUT + 수정데이터(json) = @RequestBody(json >> java코드) 필요
	@PutMapping("/{rno}")
	public ResponseEntity<String> update(@RequestBody ReplyDTO dto){
		log.info("댓글 수정 요청..."+dto);
		
		return reService.udpateReply(dto) ? 
				new ResponseEntity<String>("success", HttpStatus.OK):
				new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	// http://localhost:8080/replies/rno + DELETE
	@DeleteMapping("/{rno}")
	public ResponseEntity<String> remove(@PathVariable("rno") int rno){
		log.info("댓글 삭제.."+rno);
		
		return reService.deleteReply(rno)?
				new ResponseEntity<String>("success", HttpStatus.OK):
				new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

	
	
	
	
	
	
	
}
