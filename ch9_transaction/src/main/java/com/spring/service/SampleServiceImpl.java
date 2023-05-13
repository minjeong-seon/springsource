package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mapper.SampleMapper1;
import com.spring.mapper.SampleMapper2;

@Service("sample")
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	public SampleMapper1 mapper1;
	@Autowired
	public SampleMapper2 mapper2;
	
	@Transactional		//하나의 트랜잭션으로 처리
	@Override
	public void addData(String data) {
		mapper1.insertCol1(data);
		mapper2.insertCol1(data);

	}

}
