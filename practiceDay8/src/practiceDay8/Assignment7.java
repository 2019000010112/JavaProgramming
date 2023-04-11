//this assignment is for logical or practice

package practiceDay8;

import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char ch;
		System.out.println("Do you love java?");
		System.out.print("If 'YES' then type y/Y/  If 'NO' then type n/N :");
		ch= input.next().charAt(0);
		
		if(ch=='y' || ch=='Y') {
			System.out.print("You are a JAVA Lover");
		}
		else if (ch=='n' || ch=='N') {
			System.out.print("You are not a JAV Lover");
		}
		else {
			System.out.print("Not a valid input");
		}
	}

}
