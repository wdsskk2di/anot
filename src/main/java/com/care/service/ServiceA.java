package com.care.service;

import com.care.dao.TestDAO;

public class ServiceA implements TestService {
	private TestDAO dao;
	
	@Override
	public void execute() {
		dao = new TestDAO();
		dao.test();
	}

}
