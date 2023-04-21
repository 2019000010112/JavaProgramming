package PracticeDay17;
import java.util.Scanner;
public class PatternPractice {
	public static void main(String[]args){
		int n, row, columm;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter pattern number : ");
		n = input.nextInt();
//		//printing 
		//		1
//				12
//				123
//				1234
//				-----
		for(row = 1; row<=n; row++) {
			for(columm = 1; columm<=row; columm++) {
				System.out.print(""+columm);
			}
			System.out.println("");
		}
		System.out.println("");
//		//printing 
//		1234
//		123
//		12
//		1
//		-----
		for(row = n; row>=1; row--) {
			for(columm = 1; columm<=row; columm++) {
				System.out.print(""+columm);
			}
			System.out.println("");
		}
		//
		System.out.println("");
		System.out.println("");
		//
		for(row = n; row>=1; row--) {
			for(columm = row; columm>=1; columm--) {
				System.out.print(""+columm);
			}
			System.out.println("");
		}
	}

}
