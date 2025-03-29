package com.abhi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhi.it.Chip;

@Configuration
@ComponentScan(basePackages = "com.abhi")
public class AppConfig {
	
	@Bean
	public Chip setChip() {
		Chip chip = new Chip();
		return chip;
	}

}
