package com.cg.MongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService 
{
	@Autowired
	DBServices service;
	@RequestMapping("/main")
	public String menu()
	{
		return "1.Insert<br>2.Show";
	}
	@PostMapping("/insert")
	public String insert(@RequestBody Employee e)
	{
		service.save(e);
		return "Success";
	}
	
	@RequestMapping("/show")
	public List<Employee> show()
	{
		return service.findAll();
		
	}
	
	@RequestMapping("/remove")
	public String remove()
	{
		return service.
	}
}
