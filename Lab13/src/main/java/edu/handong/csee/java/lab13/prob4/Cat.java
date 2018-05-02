package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{ //the subclass derived from class Animal and implement interface Pet
	//class Cat is derived class from class Animal, and it implements interface Pet.
	public void food() {//method 'food' to print-out message about cat's food.
		System.out.println("Feed : Cat should eat fish!"); //print-out message about cat's food.
	}
}
