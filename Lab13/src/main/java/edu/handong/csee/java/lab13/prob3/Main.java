package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;
public class Main {//main class is the class that actually create instance and print-out the result
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//instantiate the Scanner as keyboard
		double radius, width, height;//declare double variables to put the input number
		System.out.print("Enter radius : ");//prompt to enter radius
		radius = keyboard.nextDouble();//put the input number into 'radius'

		Circle circle = new Circle(radius); //create instance 'circle' based on class Circle
		System.out.println("Radius : "+ circle.getRadius());//print-out radius value
		circle.display();//call method display to print-out area and perimeter of circle

		System.out.print("Enter width and height : ");//prompt to enter width and height
		width = keyboard.nextDouble();// put the first input number into 'width'
		height = keyboard.nextDouble();// put the second input number into 'height'

		Rectangle rectangle = new Rectangle(width, height);//create instance based on class Rectangle
		System.out.println("Width : "+ rectangle.getWidth()+ "\nHeight : "+rectangle.getHeight());//call method getWidth and getHeight to print-out width and height value
		rectangle.display();// call method display to print-out area and perimeter of rectangle
	}
}
