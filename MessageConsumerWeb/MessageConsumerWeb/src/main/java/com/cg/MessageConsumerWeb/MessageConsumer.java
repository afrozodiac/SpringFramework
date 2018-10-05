package com.cg.MessageConsumerWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.cg.MessageConsumerWeb.Employee;;

@RestController
public class MessageConsumer 
{
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/consume/{param}")
	public void consume(@PathVariable("param")int param)
	{
		String url="http://localhost:1234/emp/select/"+param;
		restTemplate.getForEntity(url, Employee.class);
		
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		Employee emp=new Employee();
		HttpEntity<Employee> emp2=new HttpEntity<Employee>(emp,headers);
		String name=restTemplate.postForObject(url, emp2, String.class);
	}
}
