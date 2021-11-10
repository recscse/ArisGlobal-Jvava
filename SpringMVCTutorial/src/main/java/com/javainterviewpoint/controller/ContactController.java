package com.javainterviewpoint.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javainterviewpoint.model.User;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)

	{

		System.out.println(user);
		// process data and from here we can put tha data into database
		
		return "success";
	}

}

/*
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String handleForm(@RequestParam("email") String
 * email, @RequestParam("userName") String userName,
 * 
 * @RequestParam("password") String password, Model model)
 * 
 * { System.out.println(email); System.out.println(userName);
 * System.out.println(password);
 * 
 * 
 * User user = new User();
 * 
 * user.setEmail(email); user.setUserName(userName); user.setPasword(password);
 * 
 * System.out.println(user); // process data and from here we can put tha data
 * into database
 * 
 * 
 * model.addAttribute("userName",userName); model.addAttribute("email", email);
 * model.addAttribute("password", password);
 * 
 * model.addAttribute("user"); return "success"; }
 */
