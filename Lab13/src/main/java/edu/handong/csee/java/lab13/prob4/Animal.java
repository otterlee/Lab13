package edu.handong.csee.java.lab13.prob4;

public class Animal { //This is the super class of class Cat and class Dog
	private String name; //Declare Private string variable 'name'
	public void setName(String name) { //use setter method because 'name' is private variable.
		this.name = name; //set the parameter 'name' as instance variable 'name'
	}
	public String getName() {//use getter method because 'name' is private variable.
		return name; //return the instance variable 'name'
	}
	public void showName() {//printing out method
		System.out.println("Name : "+ getName()); //print-out name of an animal.
	}
}
