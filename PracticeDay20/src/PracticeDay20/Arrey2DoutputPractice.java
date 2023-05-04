// 	0 	1 	2 	3 	4
// 	5 	6 	7 	8 	9
// 	10 	11 	12 	13 	14
// 	15 	16 	17 	18 	19

package PracticeDay20;
import java.util.Scanner;
public class Arrey2DoutputPractice {
	public static void main(String []args) {
		
		int [][] output2Darrey = new int [4][5];
		int row, col, k=0;
		Scanner input = new Scanner(System.in);
		
		
		//loop to generate matrix
		for(row=0; row<4; row++) {
			for(col=0; col<5; col++) {
				output2Darrey [row][col] = k;
				k++;
			}
		}
		//printing matrix values
		for(row=0; row<4; row++) {
			for(col=0; col<5; col++) {
				System.out.print(" \t"+output2Darrey[row][col]);
			}
			System.out.println();
		}
		
		
	}

}
