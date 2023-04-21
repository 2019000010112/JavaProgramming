package PracticeDay18;
import java.util.Scanner;
public class MaxMinFromArrey {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double [] number = new double[5];
		double sum = 0; 
		System.out.print("Please Enter numbers : ");
		for(int i=0; i<number.length; i++) {
		number [i]= input.nextDouble();
		}
		double max = number[0];
		for(int i = 1; i<number.length; i++) {
			if(max<number[i]) {
				max = number[i];
			}
		}
		double min = number[0];
		for(int i=1; i<number.length; i++) {
			if(min>number[i]) {
				min = number[i];
			}
		}
		System.out.print("\n Maximum number from the list is : "+max);
		
		System.out.print("\n Minimum number from the list is : "+min );
		
	}

}
