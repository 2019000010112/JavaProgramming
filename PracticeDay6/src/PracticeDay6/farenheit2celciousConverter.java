package PracticeDay6;

import java.util.Scanner;

public class farenheit2celciousConverter {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		double fahrenheit, celcious;
		
		System.out.print("Enter Fahrenheit:");
		fahrenheit = input.nextDouble();
		
		fahrenheit = fahrenheit -32;

		celcious = 0.55555555555 * fahrenheit;
		
		System.out.print("Expected Celcious:"+celcious);
		
	}

}
