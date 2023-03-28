package PracticeDay7;

import java.util.Scanner;

public class controllStatementPractice {
	public static void main(String []args) {
		System.out.print("Please enter a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		if(number>0) {
			System.out.print("Positive Number!");
		}
		else {
				System.out.print("Negetive Number!");
			}
		
	}

}
