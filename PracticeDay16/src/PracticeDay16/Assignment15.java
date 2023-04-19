package PracticeDay16;
import java.util.Scanner;
public class Assignment15 {
	public static void main(String[]args) {
		int i, n, m, temp, sum=0, r;
	    int totalArmstrongNumber=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter start number :");
		n = input.nextInt();
		System.out.print("Enter end number : ");
		m = input.nextInt();
		temp = 0;
		for(i = n; i<=m; i++) {
			sum = 0;
			temp = i;
			while(temp!=0) {
				r = temp % 10;
				sum = sum + r*r*r;
				temp = temp / 10;
			}
			if(sum == i) {
				System.out.println(sum+" ");
				totalArmstrongNumber++;
			}
			else {
				continue;
			}
		}
		System.out.print("Total armstrong numbers : \n"+totalArmstrongNumber);
	}

}
