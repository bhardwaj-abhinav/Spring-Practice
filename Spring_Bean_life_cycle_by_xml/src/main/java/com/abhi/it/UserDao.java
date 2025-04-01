package com.abhi.it;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class UserDao {
	
	public UserDao() {
		System.out.println("Dao obj is created");
	}
	
	public void init() {
		System.out.println("db connection is genrated...");
	}
	
	public void getData() {
		System.out.println("Data is genrated...");
	}
	
	public void destroy() {
		System.out.println("db connection is closed...");
	}
}
