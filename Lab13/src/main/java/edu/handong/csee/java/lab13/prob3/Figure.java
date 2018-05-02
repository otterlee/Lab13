package edu.handong.csee.java.lab13.prob3;

public abstract class Figure {//abstract class, which has abstrac method
	public abstract double area(); //abstract method, subclass from this class will implement this method 
	public abstract double perimeter(); //abstract method, subclass from this class will implement this method 
	public void display() {//print-out area and perimeter
	System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() +"\n");//print-out area and perimeter by calling methods area and perimeter
	}

}
