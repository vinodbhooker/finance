package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;
import com.google.gson.Gson;

@Service("demoService")
public class DemoService {
	
	
	@Autowired
	private UserRepository userRepository;

	public String getUsersDetails() {

		
		Iterable<Customer>userList=userRepository.findAll();
		
		
		System.out.println("user list ::"+userList);
		
		return new Gson().toJson(userList);

	}

}
