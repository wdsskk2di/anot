package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.service.ServiceA;
import com.care.service.ServiceB;
//import com.care.service.ServiceA;
import com.care.service.TestService;

@Controller
public class TestController {
	
	//방법2. App.java와 연결
	ApplicationContext ac = App.ac;
	private TestService ser;
	/*
	//@Autowired
	private TestService ser;	//이거 하나로만 쓰면 어디로 연결해야하는지 알 수 없어 오류 발생
	
	//방법 1. TestService를 다른 이름으로 각자 생성한다.	
	@Autowired	private ServiceA a;
	@Autowired	private ServiceB b; 
	*/
	
	@RequestMapping("test")
	public void test() {
		//ser = new ServiceA();
//		ser.execute();
//방법1	a.execute();
		//방법2
		ser = ac.getBean("serviceA",ServiceA.class);
		ser.execute();
	}
	
	@RequestMapping("test02")
	public void test02() {
//		ser.execute();
//방법1	b.execute();
		//방법2
		ser = ac.getBean("serviceB",ServiceB.class);
		ser.execute();
	}
}
