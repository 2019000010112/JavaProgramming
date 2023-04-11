package practiceDay12;

import java.util.Scanner;

public class factorialOfGivenNumber {
	public static void main(String[]args) {
		int i, n, sum=1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number to check factorial :");
		n = input.nextInt();
		
		for(i=n; i>=1; i--) {

			System.out.print(i+"x");
		
			sum = sum*i;
		}
		System.out.print("Factorial of "+n+ "is "+sum);
	}

}
