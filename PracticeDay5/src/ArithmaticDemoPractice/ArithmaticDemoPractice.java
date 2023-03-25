package ArithmaticDemoPractice;

import java.util.Scanner;

public class ArithmaticDemoPractice {
	public static void main (String [] args) {
		int number1, number2, result;
		String userName;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter your Name:"); //taking username as input
		userName = input.nextLine();
		
		System.out.println("\nHello "+userName+ "\nHope you are doing well today!"); //printing username inside a multiple print statement
		
		System.out.println("Enter your first operand:"); //taking 1st number from user
		number1 = input.nextInt();
		System.out.println("Enter your second operand:");//taking 2nd number from user
		number2 = input.nextInt();
		
		result = number1 + number2;		
		System.out.println("The sum of your input is:"+result);
		
		result = number1 - number2;
		System.out.println("The subtraction of your input is: "+result);
		
		result = number1 * number2;
		System.out.println("Multiplication of your input is: "+result);
		
		double result2 = (double) number1 / number2;		//here we used the type casting to change the input variable from integer to double
		System.out.println("Division of your input is: " +result2);
		
		result = number1 % number2;
		System.out.println("Modulas of your input is: "+result);
		
	}

}
