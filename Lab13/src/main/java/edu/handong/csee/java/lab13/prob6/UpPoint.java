package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrintable{//class that implements interface CapitalPrintable
	private int x,y;//declare private variable x, y
	UpPoint(int initial_x, int initial_y){//this is constructor method set the value of x, y.
		this.x = initial_x;//set the value of x
		this.y = initial_y;//set the value of y
	}
	public String toString() {
		return "x : "+x+" y : "+y;//return string which are consist of x and x value and y and y value.
	}
}