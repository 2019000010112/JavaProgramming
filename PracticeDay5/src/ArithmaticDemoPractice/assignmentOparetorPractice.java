package ArithmaticDemoPractice;

import java.util.Scanner;

public class assignmentOparetorPractice {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first assignment value:");
		int value1 = input.nextInt();
		
		System.out.print("Enter second assignment value:");
		int value2 = input.nextInt();
		
		int assignment= value1 +=value2; //value1 gets updated by adding value2
		System.out.println("Assignment output is :"+assignment);
		
		assignment= value1 -=value2; //value1 gets updated by substracting value2
		System.out.println("Assignment output is :"+assignment);
		
		assignment= value1 *=value2; //value1 gets updated by multiplying value2
		System.out.println("Assignment output is :"+assignment);
		
		assignment= value1 /=value2;	//value1 gets updated by dividing value2
		System.out.println("Assignment output is :"+assignment);
		
		assignment= value1 %=value2;	//value1 gets updated by moduling value2
		System.out.println("Assignment output is :"+assignment);
		
	}

}
