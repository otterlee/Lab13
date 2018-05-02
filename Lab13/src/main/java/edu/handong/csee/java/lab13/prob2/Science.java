package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {
	protected String publisher;//declare String variable 'publisher'
	Science(String bookName, String publisher){//constructor method which has two parameter.
		super(bookName);//use constructor of super class 'book' by giving parameter 'bookName'
		this.publisher = publisher;//set the author  by giving parameter 'publisher'
	}
	public void show() {
		System.out.println("<<Science>>");//print-out category
		System.out.println("Id : "+this.id);//print-out id number
		System.out.println("Book Name : " + this.bookName);//print-out book name
		System.out.println("Publisher : " + this.publisher);//print-out publisher
	}
}
