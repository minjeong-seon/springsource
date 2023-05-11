package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.domain.BookDTO;

public interface BookMapper {
	public int insert(BookDTO insert);
	//parameter가 2개 이상인 경우 @Param("변수명")어노테이션 필요
	public int update(@Param("price") int price,@Param("code") int code);
	public int delete(int code);
	public List<BookDTO> selectAll();
	public BookDTO selectOne(int code);
}
