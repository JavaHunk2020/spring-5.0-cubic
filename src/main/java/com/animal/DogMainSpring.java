package com.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogMainSpring {
	
	
	public static void main(String[] args) {
		//Creating spring container 
		ApplicationContext context=new ClassPathXmlApplicationContext("dogs.xml");
		Dog dog1=(Dog)context.getBean("dog");
		System.out.println(dog1);
		Dog dog2=(Dog)context.getBean("magicDog");
		System.out.println(dog2);
		dog2=null;
		
		dog2=(Dog)context.getBean("magicDog");
		System.out.println(dog2);
	}

}
