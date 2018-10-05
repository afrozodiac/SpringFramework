package com.cg.MongoDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Services 
{
	@Autowired
	DBServices service;
	@PostMapping("/insert")
	public String insert(@RequestBody Employee e)
	{
		service.save(e);
		return "Success";
	}
}
