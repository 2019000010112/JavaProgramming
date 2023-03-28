package PracticeDay6;

import java.util.Scanner;

public class circlePractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radious, area;
		
		System.out.print("Enter radious of a circle: ");
		radious=input.nextDouble();
		
		radious *= radious;
		area= 3.1416*radious;
		
		System.out.print("Area of the circle is :"+area);
	}

}
