package practiceDay11;

import java.util.Scanner;

public class assignment12 {
	public static void main(String[]args) {
		int i, m,n,sum=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter starting number: ");
		m= input.nextInt();
		System.out.println("Enter ending number: ");
		n=input.nextInt();
		
		for(i=m; i<=n;i++) {
			if(i%2==0) {
				continue;
			}
			sum=sum+i;

		}
		System.out.print("Sum of odd numbers from given input is: "+sum);
		
	}

}
