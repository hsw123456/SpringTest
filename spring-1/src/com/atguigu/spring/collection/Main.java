package com.atguigu.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = (Person) ctx.getBean("person2");
		
		System.out.println(person);
		
		NewPerson  newPerson =  (NewPerson) ctx.getBean("newPerson");
		
		System.out.println(newPerson);
		Person person3 = (Person) ctx.getBean("person3");
		
		System.out.println(person3);
		
		
	}

}
