package PracticeDay16;
import java.util.Scanner;
public class Assignment14 {
	public static void main(String[]args) {
		int i, r, n, m, temp=0, sum=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter starting number :");
		n = input.nextInt();
		System.out.print("Enter ending number :");
		m = input.nextInt();
		int totalPalindromeNumber=0;
		for(i = n; i<=m; i++) {
			sum = 0;
			temp = i;
			while(temp !=0) {
			r = temp %10;
			sum = sum * 10 + r;
			temp = temp/10;
			
			}
			if( sum == i) {
				System.out.print(sum+" ");
				totalPalindromeNumber++;
			}
			else {
				continue;
			}
		}
		
		System.out.println("\n Total Palindrome numbers : "+totalPalindromeNumber);


	}

}
