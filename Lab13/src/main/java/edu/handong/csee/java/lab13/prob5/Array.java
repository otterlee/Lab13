package edu.handong.csee.java.lab13.prob5;

public class Array {//class dealing with array
	public boolean equals(int m1[][], int m2[][]) { //method to comparing each element of matrices
		int count= 0;//declare integer variable count and initate it 0
		if (m1.length != m2.length) return false; //if each row is no equal, return false
		for(int i = 0 ; i < m1.length ; i++) {//loop row(of matrix1) times
			for(int j = 0 ; j < m1[i].length ; j++) {//loop column(of matrix1) times
				if(m1[i][j]!= m2[i][j]) count++;//if element's value is not equal, increase the count.
			}
		}
		if(count > 3 ) return false;//if count is larger than 3, two matrices is not equal. so return false 
		else return true;//the rest of case return true
	}
	public void printoutMatrix(int matrix[][]) {//method to print-out the matrix.
		int i, j;//variable for loop
		for(i=0;i<matrix.length;i++) {//loop row times
			for(j=0;j<matrix[i].length;j++) System.out.print(matrix[i][j]+" ");//loop column times and print-out element by row.
			System.out.println();//print-out new line.
		}
		System.out.println();//print-out new line.
	}
}
