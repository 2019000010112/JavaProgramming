package PracticeDay6;

import java.util.Scanner;

public class areaOfAtriangle {
	public static void main(String []args) {
		double breadth, height, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter breadth of the triangle:");
		breadth = input.nextDouble();
		System.out.print("Enter height of the triangle:");
		height = input.nextDouble();
		
		result= (double) (0.5 * breadth * height);
		
		System.out.print("Area of the triangle is :"+result);
	}

}
