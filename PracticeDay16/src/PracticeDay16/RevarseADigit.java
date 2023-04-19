package PracticeDay16;

import java.util.Scanner;

public class RevarseADigit {
	public static void main (String []args) {
		int i, n, r, sum=0, temp;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your digit to check reverse : ");
		n = input.nextInt();
		temp = n;
		while(temp!= 0) {
			r = temp%10;
			sum = sum*10+r;
			temp = temp / 10;
		}
		System.out.print("The reverse number of "+n+ " is :" +sum);
	}

}
