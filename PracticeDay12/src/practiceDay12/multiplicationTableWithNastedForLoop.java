package practiceDay12;

import java.util.Scanner;

public class multiplicationTableWithNastedForLoop {
	public static void main(String [] args) {
		int i, num=1, n, m;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter starting number : ");
		n = input.nextInt();
		
		System.out.print("Enter end number :");
		m = input.nextInt();
		
		for(i=n; i<=m; i++) {
			System.out.println("Table of "+i+" :");
			for(int j=1; j<=10; j++) {
				 num = i * j;
				System.out.println(i+"x"+j+" = "+num);
			}
			
		}
		
	}

}
