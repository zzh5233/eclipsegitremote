package com.zzh.HelloWorld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.zzh.HelloWorld.entity.Student;
import com.zzh.HelloWorld.serivice.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(HelloWorldApplicationTests.class); 
	
	@Autowired
	private Student student;
	
	@Autowired
	ApplicationContext context;
	@Test
	public void test() {
		StudentService stuService = (StudentService)context.getBean("stuService");
		System.out.println(stuService +"-----------");
	}
	
	@Test
	public void contextLoads() {
		System.out.println(student);
		
	}	
	
	@Test
	public void logText() {
		logger.trace("trace**********");
		logger.debug("debug**********");
		logger.info("info************");
		logger.warn("warn************");
		logger.error("error**********");
	}
	

}
