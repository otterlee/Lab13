package edu.handong.csee.java.lab13.prob2;

public class Main {//main class which actually create instance and call the method to print-out information.
	public static void main(String[] args) {
		Book book1 = new Book("Travel Essay"); //create instance 'book1' based on class 'Book' and set the book name as 'Travel Essay'.
		History history1 = new History("Korean History", "Kim"); // create instance 'hisory1' based on class 'History' and set the book name, author as'Korean History', 'Kim'  
		Science science1 = new Science("Fun Chemistry", "goodBooks");// create instance 'science1' based on class 'Science' and set the book name, publisher as'Fun chemistry', 'goodBooks '  
		//Science science2 = new Science("Fun Physics", "greatBooks");//extra input
		book1.show();//call the method 'show' from Book.
		history1.show();//call the method 'show' from History.
		science1.show(); // call the method 'show' from Science.
		//science2.show(); //extra method call
	}
}