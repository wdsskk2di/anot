package com.care.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {
	
	public TestDAO() {
		System.out.println("TestDAO 생성자 실행");
	}
	
	public void test() {
		System.out.println("ServiceA에서 사용하는 dao의 test() 입니다");
	}
	
	public void test02() {
		System.out.println("ServiceB에서 사용하는 dao의 test02() 입니다");
	}
}
