package PracticeDay18;
import java.util.Scanner;
public class ForEachLoopPractice {
	public static void main(String[]args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the list of names : ");
		String [] names = new String [input.nextInt()];
		
		input.nextLine();
		for(int i=0; i<names.length; i++) {
			names[i] = input.nextLine();
		}
		int len = names.length;
		System.out.print("Arrey length: "+len);
		
		System.out.print("\n The names are : ");
		for(String str : names) {  //for each loop
			System.out.println(str);
		}
	}

}
