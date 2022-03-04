package com.Maven.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("display")
	public String display()
	{
		System.out.println("hello  i am Completed the spring software ");
		return "display";
	}

}
