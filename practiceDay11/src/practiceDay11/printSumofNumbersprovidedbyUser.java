package practiceDay11;

import java.util.Scanner;

public class printSumofNumbersprovidedbyUser {

	public static void main(String[]args) {
		int m, n, i, sum=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		m=input.nextInt();
		System.out.print("Enter last number : ");
		n=input.nextInt();
		
		//using for loop
		
//		for(i=m; i<=n; i++) {
//			sum=sum+i;
//		}
//		System.out.print("Sum is :" +sum);
		
		//using while loop
		i=m;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.print("Sum is :" +sum);
	}	
}
