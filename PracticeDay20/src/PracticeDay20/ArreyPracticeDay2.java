package PracticeDay20;

//Diagonal matrix

import java.util.Scanner;
public class ArreyPracticeDay2 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		int [][] number = new int [3][3];
		int sumOfDiagonalElements=0;
		int sumOfUpperTriangleElement = 0;
		int sumOfLowerElements=0;
		System.out.print("Please enter matrix values : ");
		
		for(int row=0; row<3; row++) {
			for(int col=0; col<3; col++) {
				System.out.printf("Number[%d][%d]",row, col);
				number[row][col]=input.nextInt();
			}
		}
		
		for(int row=0; row<3; row++) {
			for(int col=0; col<3; col++) {
				if(row==col) {
					sumOfDiagonalElements = sumOfDiagonalElements + number[row][col];
				}
				if(row<col) {
					sumOfUpperTriangleElement = sumOfUpperTriangleElement+number[row][col];
				}
				if(row>col) {
					sumOfLowerElements = sumOfLowerElements+number[row][col];
				}
			}
		}
		
		System.out.print("\nSum of Diagonal elements : "+sumOfDiagonalElements);
		System.out.print("\nSum of Upper Triangle Elements : "+sumOfUpperTriangleElement);
		System.out.print("\nSum of Lower Triangle Elements : "+sumOfLowerElements);
	}
	

}
