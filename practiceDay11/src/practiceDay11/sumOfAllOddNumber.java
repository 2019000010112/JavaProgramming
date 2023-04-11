package practiceDay11;

import java.util.Scanner;

public class sumOfAllOddNumber {
	public static void main(String[]args) {
		int i, m, n, sum=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		m = input.nextInt();
		System.out.print("Enter last number : ");
		n = input.nextInt();
		
		for(i=m; i<=n; i++) {
			
			if(i%2==1) {
				System.out.println("ODD numbers are : "+i);
				sum = sum + i;
				//System.out.print("ODD numbers are : "+i);
			}
			
		}
		System.out.print("Sum of Odd numbers are : "+sum);
	}
}
