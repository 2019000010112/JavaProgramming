//this assignment is for logical and operator practice
package practiceDay8;

import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char masters, english;
		System.out.print("Have you completed your masters? type y/n :");
		masters = input.next().charAt(0);
		System.out.print("Are you fulent in English? y/n :" );
		english = input.next().charAt(0);
		
		if(masters=='y' || masters=='Y' && english=='y' || english=='Y') {
			System.out.print("Congartulation!, You are eligible to for the job interview");
		}
		else if(masters!='y' || masters!='Y' && english!='y' || english!='Y') {
			System.out.print("Sorry, you are not eligible to for the job interview");
		}
		else {
			System.out.print("Not a valid input!");
		}
	}

}
