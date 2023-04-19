package PracticeDay16;
import java.util.Scanner;

public class PalindromNumberCheck {
	public static void main(String []args) {
		int i, InputNumber, sum=0, temp=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to check Palindom : ");
		InputNumber = input.nextInt();
		temp = InputNumber;
		
		while(temp!=0) {
			i = temp%10;
			sum = sum * 10 + i;
			temp = temp/10;
		}
		System.out.print("The revarse output of "+InputNumber+" is "+sum);
		
		if(sum == InputNumber) {
			System.out.println("\n" +sum+" is a palindom Number");
		}
		else {
			System.out.println("\n"+ sum+" is not a palindom number");
		}
	}
	

}
