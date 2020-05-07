package com.care.controller;

import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

//@Service //서비스단
//@Repository //dao
@Component //단순 객체 생성
public class TestClass {
	
	public TestClass() {
		System.out.println("TestClass 생성자 입니다");
	}
	
	public void print() {
		System.out.println("TestClass.print() 메소드 입니다");
	}
}
