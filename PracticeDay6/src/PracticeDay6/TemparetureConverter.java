package PracticeDay6;

import java.util.Scanner;

public class TemparetureConverter {
	public static void main(String [] args) {
		double farenhit, celcious;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter celcious:");
		celcious = input.nextDouble();

		farenhit = 1.8 * celcious + 32;
		
		System.out.print("Exoected Farenhit:"+farenhit);
		
		
		
		
	}

}
