package com.cg.demoRest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountServices 
{	
	@GetMapping("/hello/{any}")
	public String sayHello(@PathVariable("any")String name)
	{
		return "Hello! "+name; 
	}
}
