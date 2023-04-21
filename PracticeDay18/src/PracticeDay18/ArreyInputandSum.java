package PracticeDay18;
import java.util.Scanner;
public class ArreyInputandSum {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double[] number = new double[5];
		System.out.println("Please enter your five number : ");
		number[0] = input.nextDouble();
		number[1] = input.nextDouble();
		number[2] = input.nextDouble();
		number[3] = input.nextDouble();
		number[4] = input.nextDouble();
		
		sum = number[0]+number[1]+number[2]+number[3]+number[4];
		
		System.out.print("The sum is :"+sum);
		
		
		
	}

}
