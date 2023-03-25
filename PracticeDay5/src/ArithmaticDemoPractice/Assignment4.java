package ArithmaticDemoPractice;

import java.util.Scanner;
//Create a program to calculate installment amount for per month
public class Assignment4 {
	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
		int phonePrice = 1800; // 1800 euros
		int numberOfInstallment, installmentPerMonth;

		System.out.print("Number of installments? ");
		numberOfInstallment = input.nextInt();// get number of installments from user
  

		double installmentPerMonth1 = (double) phonePrice / numberOfInstallment; // calculate  installment amount for per month
 
		
		System.out.println("Monthly installment Amount: "+installmentPerMonth1 + " euros");
		} 

	}
}