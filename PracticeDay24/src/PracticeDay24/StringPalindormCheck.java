package PracticeDay24;

import java.util.Scanner;

public class StringPalindormCheck {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your text to check palindom : ");
		String OriginalString = input.next();
		
		StringBuffer BaseString = new StringBuffer(OriginalString);
		
		//StringBuffer ReverseString =  new StringBuffer(OriginalString);
		
		String ReverseString = BaseString.reverse().toString();
		
		if(OriginalString.equals(ReverseString)) {
			System.out.print("Palindorm");
		}
		else {
			System.out.print("Not Palindorm!");
		}
	}

}
