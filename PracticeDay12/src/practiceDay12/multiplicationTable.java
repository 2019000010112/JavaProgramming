package practiceDay12;

import java.util.Scanner;

public class multiplicationTable {
	public static void main(String[]args) {
		int number=1, i;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the base number :");
		number = input.nextInt();
		
		for(i=1; i<=10; i++) {
			int sum = number *i;
			System.out.println(number+"x"+i+" = "+sum);
		}
		
	}

}
