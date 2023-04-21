package PracticeDay18;

import java.util.Scanner;

public class ArreyInputUsingLoop {
	public static void main(String[] args) {
		double sum = 0;
		double[] number = new double[5];
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter your numbers : ");

		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextDouble();
		}
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		double len = number.length;
		double avg = sum / len;
		System.out.print("\n The sum of the given numbers  : " + sum);
		System.out.print("\n The avarage of the given numbers  : " + avg);
	}

}
