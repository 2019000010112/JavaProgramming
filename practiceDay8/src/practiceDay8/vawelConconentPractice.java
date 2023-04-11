package practiceDay8;

import java.util.Scanner;

public class vawelConconentPractice {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		char ch;
		
		System.out.print("Enter your letter :");
		ch = input.next().charAt(0);
		
		if(ch=='a' || ch=='A') {
			System.out.print("This is vawel");
		}
		else if(ch=='e' || ch=='E') {
			System.out.print("This is vawel");
		}
		else if(ch=='i' || ch=='I') {
			System.out.print("This is vawel");
		}
		else if(ch=='o'|| ch=='O') {
			System.out.print("This is vawel");
		}
		else if(ch=='u' || ch=='U') {
			System.out.print("This is vawel");
		}
		else {
			System.out.print("This is Consonent");
		}
	}

}
