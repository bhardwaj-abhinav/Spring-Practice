package com.abhi.it;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracle")
@Primary
public class OracleDao implements ReportDao{

	@Override
	public void generateReport() {
		// TODO Auto-generated method stub
		System.out.println("Reported generated by oracle.....");
	}
}
