package com.javainterviewpoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
/* @RequestMapping("/first") */
public class HomeController {
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url");
		
		model.addAttribute("name", "Brijesh"); 
		model.addAttribute("id", 1234);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.print("This is help controller");
		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Brijesh");
		modelAndView.addObject("rollnumber",12345);
		
		//marks
		List<Integer>list = new ArrayList<Integer>();
		list.add(123);
		list.add(2233);
		list.add(1234567);
		list.add(323232);
		list.add(9090);
		
		modelAndView.addObject("marks",list);
		
		// setting the view name 
		modelAndView.setViewName("help");
		
		
		return modelAndView;
	}
	
	@RequestMapping("/services")
	public String services() {
		System.out.println("This is services controller");
		return "services";
		
	}

}
