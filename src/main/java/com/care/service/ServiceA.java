package com.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.care.dao.TestDAO;

@Service
public class ServiceA implements TestService {
	@Autowired		//TestDAO에 @Repository가 있으니 autowired
//	@Qualifier("testDAO")
	private TestDAO dao;
	
	@Override
	public void execute() {
		//dao = new TestDAO();	객체 생성 없이 부를 수 있음 (이거 주석처리 안하면 생성자 2개 만들어지는 문제 발생.)
		System.out.println("dao: "+ dao);
		dao.test();
	}

}
