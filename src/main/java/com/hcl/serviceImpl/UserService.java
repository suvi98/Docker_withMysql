package com.hcl.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.User;
import com.hcl.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	//dispaly all the user operation
	public List<User> getUserdetails(){
		
		return userRepository.findAll();		
	}
	
	//save   user operation
	public User createUserdetails(User user) {
		
		return userRepository.save(user);
		
	}
	
	//delete   user operation
	public void deleteUserDetails(long id) {
		
		userRepository.deleteById(id);
	}
	
	
	//update   user operation
	public User updateUserDetails(User user) {
		
		return userRepository.save(user);
	}
}
