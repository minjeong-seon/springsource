package com.spring.memo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.memo.entity.Memo;

// T : entity 명
// ID : entity 클래스의 id 칼럼 타입 기재
public interface MemoRepository extends JpaRepository<Memo, Long> {
	//JpaRepository : CRUD 작업 기능 제공 인터페이스
	// save() : 저장 및 수정
	// delete() : 삭제
	// count() : 개수 반환
	// findAll() : 모든 엔티티 조회
	// findById() : 특정 엔티티 조회
	// . . . . . 
}
