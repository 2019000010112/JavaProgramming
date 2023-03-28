package PracticeDay7;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your age:");
		int age = input.nextInt();
		
		if(age>=18) {
			System.out.print("You are a valid voter!");
		}
		else {
			System.out.print("You are not a valid voter!");
		}
	}

}
