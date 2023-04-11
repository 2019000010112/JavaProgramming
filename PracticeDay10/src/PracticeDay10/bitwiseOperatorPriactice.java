package PracticeDay10;

import java.util.Scanner;

public class bitwiseOperatorPriactice {
	public static void main(String[]args) {
		int numberOne, numberTwo;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		numberOne = input.nextInt();
		
		System.out.print("Enter second number :");
		numberTwo = input.nextInt();
		
		int sum = numberOne & numberTwo;
		System.out.print("The result of bitwise AND is :"+sum);
		
		int sum2 = numberOne ^ numberTwo;
		System.out.print("The result of bitwise EXOR is :"+sum2);

		int sum4 = numberOne | numberTwo;
		System.out.print("\nThe result of bitwise OR is :"+sum4);
		
		int sum5 = numberOne >> 4;
		System.out.print("\nThe result of bitwise Right Shift :" +sum5);
		
		int sum6 = numberOne<<4;
		System.out.print("\nThe result of bitwise Left shift is:" +sum6);
		
	}

}
