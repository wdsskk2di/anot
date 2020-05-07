package com.care.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.care.test.Test;

//@Component
public class Test02 {
	//@Autowired
	//public Test test;
	
	public Test02() {
		System.out.println("Test02 생성자 입니다");
	}
	
	public void test02() {
		//test.test();
		System.out.println("Test02.test02() 메소드 실행");
	}
}
