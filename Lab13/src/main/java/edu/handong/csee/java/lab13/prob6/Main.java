package edu.handong.csee.java.lab13.prob6;

public class Main {//Main class is a class that actually creates instance and prints out the converted result

	public static void main(String[] args) {
		UpPoint p1 = new UpPoint(3,3); //create instance based on UpPoint class with parameter 3,3
		DownPoint p2 = new DownPoint(2,5); //create instance based on DownPoint class with parameter 2,5
		DownPoint p3 = new DownPoint(4,7); //create instance based on DownPoint class with parameter 4,7
		UpPoint p4 = new UpPoint(9,12);//create instance based on UpPoint class with parameter 9, 12
		Printer.print(p1);//call static method print with parameter object p1
		Printer.print(p2);//call static method print with parameter object p2
		Printer.print(p3);//call static method print with parameter object p3
		Printer.print(p4);//call static method print with parameter object p4
	}
}
