package PracticeDay16;

import java.util.Scanner;

public class ArmstrongNumberCheck {
	public static void main(String[]args) {
		int n, sum, temp;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a digit to check :");
		n = input.nextInt();
		
		temp = 0;
		sum = 0;
		temp = n;
		
		while(temp!=0) {
			int r = temp % 10;
			sum = sum + r*r*r;
			temp = temp / 10;
		}
		if(sum == n) {
			System.out.print("This is armastrong number");
		}
		else {
			System.out.print("This is not a armastrong number");
		}
	}

}
