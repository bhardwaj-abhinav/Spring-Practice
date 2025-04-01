package com.abhi.it;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDao implements InitializingBean, DisposableBean{
	
	public void getData() {
		System.out.println("Data is genrated...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("obj is destroyed");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("obj is created for redis..");
	}
	
	
}
