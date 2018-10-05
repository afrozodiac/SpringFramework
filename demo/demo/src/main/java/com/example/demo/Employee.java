package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="emp")
public class Employee 
{
	@Autowired
	Address add;
	public void welcome()
	{
		
		System.out.println("Hello"+ add.getBuildName());
	}
}
