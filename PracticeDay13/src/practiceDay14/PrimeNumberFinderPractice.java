package practiceDay14;

import java.util.Scanner;

public class PrimeNumberFinderPractice {
	public static void main(String[]args) {
		int i, j, number,m, count=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to check :");
		number= input.nextInt();
		
		/*learned by own practice
		 * for(i=2; i<number; i=i+1) { if(number%i==0 || number%i==1) {
		 * System.out.print(number+" is not a prime number"); break; } else {
		 * System.out.print(number+ " is prime number"); break; } //break; }
		 */
		
		//lerned from online
		if(number ==0 || number ==1) {
			System.out.print("This is not a prime number");
		}
		else {
		for(i=2; i<number/2; i++) {
			if(number%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.print("This is a prime number");
		}else {
			System.out.print("This is not a prime number");
		}	

		}
	}

}
