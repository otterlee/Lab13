package edu.handong.csee.java.lab13.prob3;

public class Circle extends Figure{//the class implements abstract method area and perimeter
	private double radius;//declare private instance variable radius
	Circle(double r){//constructor method with parameter r
		this.radius = r; //set r to radius
	}

	public double getRadius() { //getter method
		return radius;// return radius value
	}

	public double area() {//method calculating area
		return radius*radius * Math.PI;//return the result of multiplying squared radius by PI
	}

	public double perimeter() {//method calculating perimeter
		return 2*radius*Math.PI; //return the result of multiplying diameter by PI
	}
}
