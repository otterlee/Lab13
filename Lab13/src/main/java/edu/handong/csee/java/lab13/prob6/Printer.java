package edu.handong.csee.java.lab13.prob6;

public class Printer { //class that include print method
	static public void print (Object object) {//method to print String
		String string = object.toString();//call toSting method of object, and put it into string.
		if(object instanceof CapitalPrintable) { // this means that if object's type is based on CapitalPrintable
			//instance based on class UpPoint will return true in this condition, because UpPoint class implements interface CapitalPrintable 
			string = string.toUpperCase();//change string to upper case.
		}
		System.out.println(string);//print-out string
	}
}
