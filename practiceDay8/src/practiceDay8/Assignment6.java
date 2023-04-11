package practiceDay8;

import java.util.Scanner;

public class Assignment6 {
	public static void main(String []args) {
		int inputNumber;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number between 0-9 : ");
		inputNumber = input.nextInt();
		
		if(inputNumber==0) {
			System.out.print("Zero");
		}
		else if (inputNumber==1) {
			System.out.print("One");
		}
		else if (inputNumber==2) {
			System.out.print("Two");
		}
		else if (inputNumber==3) {
			System.out.print("Three");
		}
		else if (inputNumber==4) {
			System.out.print("Four");
		}
		else if (inputNumber==5) {
			System.out.print("Five");
		}
		else if (inputNumber==6) {
			System.out.print("Six");
		}
		else if (inputNumber==7) {
			System.out.print("Seven");
		}
		else if (inputNumber==8) {
			System.out.print("Eight");
		}
		else if (inputNumber==9) {
			System.out.print("Nine");
		}
		else {
			System.out.print("Invalid digit");
		}
	}

}
