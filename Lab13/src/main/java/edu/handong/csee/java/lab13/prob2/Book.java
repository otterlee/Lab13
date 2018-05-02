package edu.handong.csee.java.lab13.prob2;

public class Book { //super class 'Book'
	private static int idcount = 0; //set this variable as static, because it takes increasing number.
	protected int id; //declare instance variable integer 'id'
	protected String bookName, publisher, author;
	
	Book(String bookName){ //this is constructor method.
		this.bookName = bookName; //set the book name.
		idcount++; //increase the id count.
		id = idcount; // and set id count which is increased number as id.
	}
	
	public void show() {
		System.out.println("<<BOOK>>"); //print-out category
		System.out.println("Id : " + this.id); //print-out id number
		System.out.println("Book Name : " + this.bookName);//print-out book name
	}
}
