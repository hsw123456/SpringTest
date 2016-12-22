package com.atguigu.spring.benascycle;

public class Car {
	
	public Car() {
		
		System.out.println("car's Constructor");
	}
	
	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("Car's setBrand Method.....");
	}
	
	public void init(){
		System.out.println("init method.....");
	}
	
	public void destory(){
		System.out.println("destory method......");
	}
}
