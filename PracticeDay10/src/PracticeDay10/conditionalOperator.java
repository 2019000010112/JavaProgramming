package PracticeDay10;

import java.util.Scanner;

public class conditionalOperator {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int numberOne, numberTwo, numberThree;
		
		System.out.print("Enter first number: ");
		numberOne = input.nextInt();
		System.out.print("Enter Second number: ");
		numberTwo = input.nextInt();
		System.out.print("Enter Third number: ");
		numberThree = input.nextInt();
		
		//conditional operator practice
		int largeNumber = (numberOne > numberTwo) ? numberOne : numberTwo;
		
		System.out.print("Large number from the list is : " + largeNumber);
		
		//int largeNumber = (numberOne > numberTwo) ? numberOne : (numberOne > numberThree) ? numberOne : numberOne <= 89 ? "junior" : "senior";

		
	}

}
