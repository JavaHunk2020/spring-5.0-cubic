package com.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopBatterySpringMain {
	
	
	public static void main(String[] args) {
		//Creating spring container 
		ApplicationContext context=new ClassPathXmlApplicationContext("laptop-battery.xml");
		Laptop laptop=(Laptop)context.getBean("laptopa");
		System.out.println(laptop);
	}

}
