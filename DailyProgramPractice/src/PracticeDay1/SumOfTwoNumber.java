package PracticeDay1;

import java.util.Scanner;

public class SumOfTwoNumber {
	public static void main(String []args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		int sum = a + b;
		
		if(a.contain(b)){
		 sum = sum*2;
		}
		System.out.print(sum);
	}
}