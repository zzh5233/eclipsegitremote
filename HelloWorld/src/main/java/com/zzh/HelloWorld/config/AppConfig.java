package com.zzh.HelloWorld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zzh.HelloWorld.serivice.StudentService;

@Configuration
public class AppConfig {
	
	@Bean()
	public StudentService stuService() { //<bean id="xxxxxxxx">
		StudentService stuService = new StudentService();
		
		//StudentDao stuDao = new StudentDao();
		//stuService.setStudentDao(stuDao);
		return stuService;	//返回值 <bean class="xxxxxxxxxxxxx">
	}
}
