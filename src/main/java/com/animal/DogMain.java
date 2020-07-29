package com.animal;

public class DogMain {

	public static void main(String[] args) {
		
		//who is creating instance of Dog? programmer
		Dog dog=new Dog();
		//who is setting the state of the dog ? programmer
		dog.setColor("white");
		dog.setName("Tommy");
		dog.setTail(2);
		
		
		String result=dog.toString();
		System.out.println(result);
		
		//killing the dog ??programmer
		dog=null;
		
	}

}
