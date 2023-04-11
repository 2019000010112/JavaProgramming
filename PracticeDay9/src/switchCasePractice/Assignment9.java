package switchCasePractice;

import java.util.Scanner;

public class Assignment9 {
	public static void main(String[]args) {
		int option;
		Scanner input = new Scanner(System.in);
		System.out.print("Please select a Option (1-4) :");
		option = input.nextInt();
		
		switch (option) {
		case 1:
			System.out.print("Selected language is Bengali");
			break;
		case 2:
			System.out.print("Selected language is Hindi");
			break;
		case 3:
			System.out.print("Selected language is Urdu");
			break;
		default:
			System.out.print("Selected language is English");
		}
	}

}
