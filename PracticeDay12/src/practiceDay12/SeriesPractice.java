package practiceDay12;

import java.util.Scanner;

public class SeriesPractice {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		float n ; double sum=0;
		
		System.out.print("Enter the last number :");
		n = input.nextFloat();
		//printing series with difference of 1 
//		for(int i = 1; i<=n; i++) {
//			System.out.print(i+"+");
//			sum= sum+i;
//			
//		}
//		//for printing series with difference of 2
//		for(int i= 1; i<=n; i=i+2) {
//			System.out.print(i+" ");
//			sum = sum+i;
//		}
		
		//for printing series with difference of 1 with float input
		/*
		 * for(double i = 1.5; i<=n; i=i+1) { System.out.print(i+" "); sum = sum+i; }
		 */
		for(int i = 1; i<=n; i=i+1) {
			System.out.print(i+" X "+i +"," );
			sum = sum+i*i;
		}
		System.out.print("The sum is : " +sum);
		
	}

}