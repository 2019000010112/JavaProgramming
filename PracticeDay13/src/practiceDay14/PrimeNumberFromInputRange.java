package practiceDay14;

import java.util.Scanner;

public class PrimeNumberFromInputRange {
	public static void main(String[]args) {
		int i, n, m, count=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter starting number: ");
		m = input.nextInt();
		System.out.print("Enter end number : ");
		n = input.nextInt();
		
		for(i= m; i<=n; i++) {
			if(i==0 || i==1) {
				continue;
			}
			else{
			for(int j = 2; j<i; j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.println(i);
				
			}
			count=0;
		   }
			
		}
	}

}
