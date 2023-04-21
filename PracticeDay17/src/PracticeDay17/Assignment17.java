
//binary pattern printing assignment
package PracticeDay17;
import java.util.Scanner;
public class Assignment17 {
	public static void main(String[]args) {
		int n, row, column;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter pattern number : ");
		n = input.nextInt();
		
		for(row = 1; row<=n; row++) {
			for(column=1; column<=row; column++) {
				if(column%2==1) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println("");
		}
	}

}
