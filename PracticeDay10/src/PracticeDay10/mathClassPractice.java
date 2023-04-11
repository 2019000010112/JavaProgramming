package PracticeDay10;

import java.util.Scanner;

public class mathClassPractice {
	public static void main(String []args) {
		int numberOne, numberTwo;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		numberOne = input.nextInt();
		System.out.print("Enter second number" );
		numberTwo = input.nextInt();
		
		int sum = (int) Math.multiplyFull(numberOne, numberTwo);
		System.out.print("The sum generated from math function is: "+sum);
	}

}
