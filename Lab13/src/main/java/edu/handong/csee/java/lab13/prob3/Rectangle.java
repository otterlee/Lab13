package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Figure{ //the class implements abstract method area and perimeter
	private double width, height;//declare private instance variables width and height
	Rectangle(double w, double h){//constructor method which set width and height
		this.width = w;//set the parameter w to width
		this.height = h;//set the parameter h to height
	}
	public double getWidth() {//getter method
		return width;//return width value
	}
	
	public double getHeight() {//getter method
		return height;//return height value
	}
	
	public double area() { //method calculating area
		return width * height; //return the result of calculating area by multiplying width and height
	}
	
	public double perimeter() {//method calculating perimeter
		return 2*(width + height); // return the result of calculating perimeter by multiplying width plus height by 2
	}
}
