package switchCasePractice;

import java.util.Scanner;

public class switchCasePractice {
	public static void main(String []args) {
		int digit;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a digit (0-9) to check spealling: ");
		digit = input.nextInt();
		
		switch (digit) {
		case 0:
			System.out.print("Zero");
			break;
		case 1:
			System.out.print("One");
			break;
		case 2:
			System.out.print("Two");
			break;
		case 3:
			System.out.print("Three");
			break;
		case 4:
			System.out.print("Four");
			break;
		case 5:
			System.out.print("Five");
			break;
		case 6:
			System.out.print("Six");
			break;
		case 7:
			System.out.print("Seven");
			break;
		case 8:
			System.out.print("Eight");
			break;
		case 9:
			System.out.print("Nine");
			break;
			default:
				System.out.print("Not a valid digit!");
		}

	}

}
