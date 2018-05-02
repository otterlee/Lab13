package edu.handong.csee.java.lab13.prob2;

public class History extends Book{ //the subclass derived from class Book
	protected String author; //declare String variable 'author'
	History(String bookName, String author){ //constructor method which has two parameter.
		super(bookName); //use constructor of super class 'book' by giving parameter 'bookName'
		this.author = author; //set the author  by giving parameter 'author'
	}
	public void show() {//method to print-out information about history book
		System.out.println("<<History>>"); //print-out category
		System.out.println("Id : "+id);//print-out id number
		System.out.println("Book Name : " + this.bookName);//print-out book name
		System.out.println("Author : " + this.author);//print-out author
	}
}
