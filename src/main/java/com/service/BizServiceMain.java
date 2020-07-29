package com.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BizServiceMain {

	public static void main(String[] args) {

		// Creating spring container
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("biz-service.xml");
		//reading biz-service.xml and creating bean of BizService
		
		//Accessing bean of BizService type from spring container
		//which bean name is biza
		BizService bizService1=(BizService)context.getBean("biza");
		//BizService bizService2=context.getBean(BizService.class);
		
		//I am creating an instance of Biz pojo
		Biz biz=new Biz();
		biz.setBrand("Samsung");
		biz.setId(45);
		biz.setName("Silver");
		Timestamp timestamp=new Timestamp(new Date().getTime());
		biz.setDoe(timestamp);
		
		//I am calling save method of BizService class
		//and passing biz instance as a parameter
		bizService1.save(biz);

		System.out.println("Hello Fetching all the data from the database");
		List<Biz> bizs=bizService1.findAll();
		for(Biz pbiz:bizs){
			System.out.println(pbiz);
		}
	}

}
