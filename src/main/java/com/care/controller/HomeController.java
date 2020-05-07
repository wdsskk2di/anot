package com.care.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired	//객체 자동 주입. @Controller만들어진 데에서만 사용 가능
	private TestClass testclass;
	
	//private TestClass testclass;
	public HomeController() {		
		
		System.out.println("homecontroller 생성자 실행입니다");
		
		/*
		String config = "classpath:config/context-config2.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		testclass = ctx.getBean("testclass",TestClass.class);	//context-config2.xml에 추가한 bean의 id와 동일하게.
		testclass.print();
		*/
		
		System.out.println("homeController 생성자 확인:"+testclass);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("/경로에서 확인: "+testclass);
		testclass.print();
		
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
