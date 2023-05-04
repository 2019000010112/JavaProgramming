package PracticeDay20;
import java.util.Scanner;
import java.util.Arrays;
public class ArreyAssendingDescending {
	public static void main(String []args) {
		int row, col;
		
		int [] numberArrey = new int [3];
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your number : ");
		for(row=0; row<3; row++) {
			//for(col=0; col<4; col++) {
				numberArrey[row] = input.nextInt();
			//}

		}
		
		//Arrays.sort(numberArrey);
		
		//printing arrays
		System.out.print("Before sorting the arrey : ");
		for(row=0; row<3; row++) {
			//for(col=0; col<4; col++) {
				System.out.print("\t"+numberArrey[row]);
			//}
		}
		
		Arrays.sort(numberArrey);
		
		System.out.println();
		//printing arrays
		System.out.print("After sorting the arrey (ASSCENDING): ");
		for(row=0; row<3; row++) {
			//for(col=0; col<4; col++) {
				System.out.print("\t"+numberArrey[row]);
			//}
		}
		
		
		System.out.println();
		//printing arrays
		System.out.print("After sorting the arrey (DESCENDING): ");
		for(row=2; row>=0; row--) {
			//for(col=3; col>=0; col--) {
				System.out.print("\t"+numberArrey[row]);
			//}
		}
	}

}
