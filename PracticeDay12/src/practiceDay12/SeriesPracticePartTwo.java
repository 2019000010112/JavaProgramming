package practiceDay12;

import java.util.Scanner;

public class SeriesPracticePartTwo {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int i, n, m, sum=1;
		
		System.out.print("Enter the first number :");
		n = input.nextInt();
		
		for(i=1; i<=n; i++) {
		System.out.println("Numbers are : " +i+" ");
			sum = sum * i;
		}
		System.out.print(sum);
	}

}
