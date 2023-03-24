package userInputPractice;
import java.util.Scanner;

public class userInputPractice {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.print("Enter your name :");
		name = input.nextLine();
		System.out.println("Hi "+name);
		
	}

}
