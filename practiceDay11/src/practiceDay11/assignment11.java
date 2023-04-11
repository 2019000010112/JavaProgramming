package practiceDay11;

import java.util.Scanner;

public class assignment11 {
	public static void main(String [] args) {
		int i, number, fact=1;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number= input.nextInt();
		
		for(i=1; i<=number; i++) {
			fact = fact* i;
		}
		System.out.println("Factorial of "+number+"is :"+fact);
	}

}
