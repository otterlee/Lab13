package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{
	//class Dog is derived class from class Animal, and it implements interface Pet.
	public void food() {//method 'food' to print-out message about dog's food.
		System.out.println("Feed : Dog should eat Sausage!");//print-out message about dog's food.
	}
}
