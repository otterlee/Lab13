package edu.handong.csee.java.lab13.prob6;

public class DownPoint {//class that has string with lower case letters
	private int x,y; //declare private variable x, y
	DownPoint(int initial_x, int initial_y){//this is constructor method set the value of x, y.
		this.x = initial_x;//set the value of x
		this.y = initial_y;//set the value of y
	}
	public String toString() { //method which returns string
		return "x : "+x+" y : "+y; //return string which are consist of x and x value and y and y value.
	}
}
