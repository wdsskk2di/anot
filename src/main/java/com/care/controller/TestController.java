package com.care.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.service.ServiceA;
import com.care.service.TestService;

@Controller
public class TestController {
	private TestService ser;
	
	@RequestMapping("test")
	public void test() {
		ser = new ServiceA();
		ser.execute();
	}
}
