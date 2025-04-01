package com.abhi.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("UserDao")
public class UserService {
	@Autowired
	UserDao dao;
	
	public void processData() {
		System.out.println("Getting data...");
		dao.getData();
	}
}
