package com.atguigu.spring.beansannotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.spring.beansannotation.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public void add(){
		System.out.println("UserService's add()....");
		userRepository.save();
	}
}
