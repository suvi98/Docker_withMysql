package com.hcl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.model.Book;
import com.hcl.model.User;
import com.hcl.serviceImpl.UserService;


@Controller
public class LoginController {


	//configured the userservice class
	@Autowired
	UserService userService;
	
	
	//display the login page
	@RequestMapping("/login")
	public String login() {
		
		return "loginuser";
	}
	
	//display the register page
	@RequestMapping("/register")
	public String register() {
		
		return "registeruser";
	}
	
	//display the welcome page
	@RequestMapping(value="/welcome", method= RequestMethod.GET)
	public String getUser(ModelMap model){
		
		
		return 	"welcome";	
	}

	//save user details in user table i.e registration operation
	@RequestMapping(value="/save/user", method= RequestMethod.POST)
	public String register(ModelMap model,User user) {
		
		userService.createUserdetails(user);
		
		//after registration go on login page
		return "loginuser";
	}
	

	//login opration in which take id and password from user and compare user details already exist or not
	@RequestMapping(value="/welcome", method= RequestMethod.POST)
	public String loginuser(ModelMap model,User user) {
		

		
		for(User user1:userService.getUserdetails()) {
			
			if(user.getUemail().equals(user1.getUemail()) && user.getUpassword().equals(user1.getUpassword())) {
				model.put("uemail", user.getUemail());
				
				//after login successfully go on welcome page
				return "welcome";
			}
		}
		
		model.put("errorMsg", "Please provide the correct details");
		
		//after login unsuccessfully go on again login page
		return "loginuser";
		
	}

	
}
