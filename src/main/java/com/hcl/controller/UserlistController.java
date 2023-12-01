package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.model.User;
import com.hcl.serviceImpl.UserService;

@Controller
public class UserlistController {

	//configured the userservice class
	@Autowired
	UserService userService;
	
	//display the user list
	@GetMapping("/user")
	public String userlist(ModelMap model) {
		
		//display all user list
		model.addAttribute("listuser", userService.getUserdetails());
		return "user";
	}
	
	
	//display add user page
	@GetMapping("/adduser")
	public String addUserpage() {
		
		return "addnewUser";
	}
	
	//save user details in user table
	@RequestMapping(value="/user/save", method= RequestMethod.POST)
	public String saveUser(ModelMap model, User user) {
		
		userService.createUserdetails(user);
		model.addAttribute("listuser", userService.getUserdetails());
		return "user";
	}
	
	//delete user details in user table by id
	@RequestMapping(value="/user/delete/{id}", method= RequestMethod.GET)
	public String deleteUser(ModelMap model,@PathVariable long id) {
		
		
		//delete user data by id
		userService.deleteUserDetails(id);
		
		//after delete display all user list
		model.addAttribute("listuser", userService.getUserdetails());
		return "user";
	}
	
	//Go on page for put the details for updates by id
	@GetMapping("/updateUser/{uid}")
	public String updateUserpage(ModelMap model,@PathVariable long uid) {
		
		//take id of user for update 
		model.addAttribute("uid", uid);
		
		//display the update list
		model.addAttribute("listuser",userService.getUserdetails());
		
		return "updateUserpage";
	}
	
    
	//update the value by id and display list 
	@PostMapping("/updateUser")
	public String updateUserlist(ModelMap model, User user) {
		
		User res = new User();
		
		//get values from user and save in database
		res.setUid(user.getUid());
		res.setUemail(user.getUemail());
		res.setUpassword(user.getUpassword());
		res.setDateofbirth(user.getDateofbirth());
		
		
		System.out.println(res);
		//save the update values
		userService.updateUserDetails(res);
		
		model.addAttribute("uid",user.getUid());
		
		model.addAttribute("msg", "User with id : " + user.getUid() + " updated successfully.");
		
		//dispaly the update list
		model.addAttribute("listuser", userService.getUserdetails());
		
		//return update list
		return "user";
	}
}
