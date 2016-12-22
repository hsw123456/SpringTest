package com.atguigu.spring.beansannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beansannotation.controller.UserController;
import com.atguigu.spring.beansannotation.repository.UserRepository;
import com.atguigu.spring.beansannotation.service.UserService;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans-annotation.xml");
		
//		TestObject to = (TestObject) ctx.getBean("testObject");
//		System.out.println(to);
//		
//		
//		UserService us = (UserService) ctx.getBean("userService");
//		System.out.println(us);
		
//		UserRepository ur = (UserRepository) ctx.getBean("userRepository");
//		System.out.println(ur);
		UserController uc = (UserController) ctx.getBean("userController");
		System.out.println(uc);
		uc.execute();
	}

}
