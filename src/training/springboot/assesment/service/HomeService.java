package com.training.springbootassesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springbootassesment.model.User;
import com.training.springbootassesment.repository.HomeRepository;

@Service
public class HomeService {
	
	@Autowired
	HomeRepository repository;
	
	public boolean isValid(String uname, String pwd) {
		System.out.println("from page: "+uname+":"+pwd);
		List<User> users = repository.findAll();
		boolean valid = false;
		for(User usr:users) {
			System.out.println(usr.getUserName()+":"+usr.getPassword());
			if(uname.equals(usr.getUserName()) && pwd.equals(usr.getPassword())){
				valid = true;
			}
			
		}
		
		return valid;
		
	}

}
