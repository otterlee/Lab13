package edu.handong.csee.java.lab13.prob5;

import java.util.*;

public class Main {// class Main is the class that create object of array and print-out the result about comparing two matrices
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner as keyboard
		int r,c;//declare integer variable for loop statement
		boolean matrixEquals; //declare boolean variable for identity between two matrices

		System.out.print("Enter row size(maximum 5) : ");//prompt to enter row size of matrix1
		int row1 = keyboard.nextInt();//put the input number to 'row1'
		System.out.print("Enter column size(maximum 5) : ");//prompt to enter column size of matrix1
		int col1 = keyboard.nextInt();//put the input number to 'col1'

		System.out.print("Enter row size(maximum 5) : ");//prompt to enter row size of matrix2
		int row2 = keyboard.nextInt();//put the input number to 'row2'
		System.out.print("Enter column size(maximum 5) : ");//prompt to enter column size of matrix2
		int col2 = keyboard.nextInt();//put the input number to 'col2'

		int matrix1[][]= new int[row1][col1];//create two dimensional array 'matrix1' that consists of row1 and col1.
		System.out.print("Enter the list 1 : ");//prompt to enter the all element of matrix1
		for(r = 0; r< matrix1.length ; r++) { //loop 'matrix1.length' times which is same matrix1's row.
			for(c = 0; c< matrix1[r].length; c++) { //loop 'matrix1[i].length' times which is same matrix1's column.
				matrix1[r][c] = keyboard.nextInt(); //put the input number into each elements.
			}
		}

		int matrix2[][]= new int[row2][col2];//create two dimensional array 'matrix2' that consists of row2 and col2.
		System.out.print("Enter the list 2 : ");//prompt to enter the all element of matrix2
		for(r = 0; r< matrix2.length ; r++) {//loop 'matrix2.length' times which is same matrix2's row.
			for(c = 0; c< matrix2[r].length ; c++) {//loop 'matrix2[i].length' times which is same matrix2's column.
				matrix2[r][c] = keyboard.nextInt();//put the input number into each elements.
			}
		}

		Array arrayComparison = new Array();//instantiate class Array which action is comparing each matrices and printing out matrix elements into 'arrayComparison'
		arrayComparison.printoutMatrix(matrix1);//call 'printoutMatrix' method to print-out matrix1's elements
		arrayComparison.printoutMatrix(matrix2);//call 'printoutMatrix' method to print-out matrix2's elements

		matrixEquals = arrayComparison.equals(matrix1, matrix2);//call 'equal' method to compare two matrices and put return value to 'matrixEqual'
		if(matrixEquals == true) System.out.println("The two arrays are approximately identical");//if matrixEqual's value is true, print-out message "approximately identical"
		else System.out.println("The two arrays are not identical");//if matrixEqual's value is false, print-out message "not identical"
	}
}
