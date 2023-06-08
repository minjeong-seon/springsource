package com.spring.memo.repository;


import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.memo.entity.Memo;

import lombok.Builder;

@SpringBootTest
public class MemoRepositoryTest {

	@Autowired
	private MemoRepository memoRepository;

	//insert 구문
//	@Test
//	public void createMemoTest() {
//		
////		Memo memo = new Memo();
////		memo.setMemoText("첫 번째 메모");
////		
////		// save() : insert, update
////		memoRepository.save(memo);
//
//		for (int i = 0; i < 100; i++) {
////		Memo memo = new Memo();
////			memo.setMemoText("memo..."+i);
////			memoRepository.save(memo);
//			
//			// Memo entity 클래스에서 @Builder 어노테이션 사용 시 set, get 생략 가능
//			Memo memo = Memo.builder()
//								.memoText("Memo..."+i)
//								.build();
//			memoRepository.save(memo);
//		}
//	}

//	//select 구문
//	@Test
//	public void findByMemo() {
//		// 조회 : findById()
//	  	Optional<Memo> result = memoRepository.findById(90L);
//	  	
//	  	//.findById(90L) 조회대상 존재 = true 시, 내용 가져오기
//	  	if(result.isPresent()) {
//	  		System.out.println(result.get());
//	  	}
//	}
//
//	
//	@Test
//	public void findByMemoList() {
//		// 조회 : findById()
//	  	List<Memo> result = memoRepository.findAll();
//	  	
//	  	result.forEach(memo -> System.out.println(memo));
//	  	}  	

	
//	@Test
//	public void udpateMemo() {
//		// save() : insert, update
//		
//		Memo memo = Memo.builder()
//										.mno(80L)
//										.memoText("수정 메모")
//										.build();
//		
//		Memo update = memoRepository.save(memo);
//		System.out.println(update);								
//	  	}  	

	
	@Test
	public void deleteMemo() {
		// 행 삭제
		memoRepository.deleteById(90L);
	  	}  	

}
