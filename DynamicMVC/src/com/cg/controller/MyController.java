package com.cg.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.Employee;

@Controller	
public class MyController 
{
	@RequestMapping(value="start",method=RequestMethod.GET)
	public ModelAndView handle(Model model)
	{
		String message="welcome to Spring MVC";
		model.addAttribute("emp",new Employee());
		return new ModelAndView("Hello","message",message);
	}
	@RequestMapping("welcome")
	public String showMessage(@RequestParam("uname")String uname,@RequestParam("company")String company,Model model)
	{
		model.addAttribute("company", company);
		model.addAttribute("uname",uname);
		return "welcome";
	}
	@RequestMapping("register")
	public String registerEmp(@Valid @ModelAttribute("emp")Employee emp,BindingResult res,Model model)
	{
		if(res.hasErrors())
			return "Hello";
		else
		return "success";
	}
}
