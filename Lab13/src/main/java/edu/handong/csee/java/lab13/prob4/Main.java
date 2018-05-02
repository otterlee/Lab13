package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner;

public class Main {//main class is the class that actually create instance based on class Cat and Dog and print-out about their food
	//main class which actually create instance and use interface.
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //instantiate Scanner as keyboard
		String catName, dogName;//declare String variable to put cat's name and dog's name.
		System.out.print("Enter the cat name and dog name: ");//prompt to enter pet's names.
		catName = keyboard.next();//put the first input to catName
		dogName = keyboard.next(); // put the second input to dogName
		
		Master master = new Master();//instantiate Master to master
		Dog mydog = new Dog();//create instance 'mydog' based on class Dog.
		Cat mycat = new Cat();//create instance 'mycat' based on class Cat.
		mydog.setName(dogName);//set the dog name by using setName.
		mycat.setName(catName);//set the cat name by using setName.

		master.feed(mycat);//use method 'feed' from Master. and print-out mycat's feeding message 
		master.feed(mydog);//use method 'feed' from Master. and print-out mydog's feeding message 
	}
}
