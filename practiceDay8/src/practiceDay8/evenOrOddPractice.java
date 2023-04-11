package practiceDay8;

import java.util.Scanner;

public class evenOrOddPractice {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.print("Enter a number to check:");
		num = input.nextInt();
		
		if(num%2==0) {
			System.out.print("This is a EVEN number");
		}
		else {
			System.out.print("This is a ODD number");
		}
	}

}
