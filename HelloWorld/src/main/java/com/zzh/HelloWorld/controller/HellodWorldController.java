package com.zzh.HelloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellodWorldController {
	
	@ResponseBody
	@RequestMapping("helloWorld")
	public String helloWorld() {
		return "hello world; hello spring boot";
	}
}
