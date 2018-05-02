package edu.handong.csee.java.lab13.prob4;

public class Master {
	public void feed(Pet pet) {
		//use method of interface 'Pet'
		pet.showName();//call method showName which is from derived class from class Animal.
		pet.food();//call method food which is from derived class from class Animal.
	}
}
