package practiceDay19;
import java.util.Scanner;
public class arrey2DpracticePart2 {
	public static void main(String []args) {
		int row, col;
		Scanner input = new Scanner(System.in);
		
		int [][] matrixA = new int [3][3]; 
		int [][] matrixB = new int [3][3];
		int [][] matrixC = new int [3][3];
		
		System.out.println("Please enter matrix A values : ");
		for(row=0; row<3; row++){
			for(col=0; col<3; col++) {
				System.out.printf("A [%d][%d] = ",row,col);
				matrixA[row][col] = input.nextInt();
			}
		}
		
		System.out.println("Please enter matrix B values : ");
		for(row=0; row<3; row++){
			for(col=0; col<3; col++) {
				System.out.printf("B [%d][%d] = ",row,col);
				matrixB[row][col] = input.nextInt();
			}
		}
		
		System.out.println("Matrix A values : ");
		for(row=0; row<3; row++){
			for(col=0; col<3; col++) {
				System.out.print(" \t"+matrixA[row][col]);
			}
			System.out.println();
		}
		
		System.out.println("Matrix B values : ");
		for(row=0; row<3; row++){
			for(col=0; col<3; col++) {
				System.out.print(" \t"+matrixB[row][col]);
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		System.out.println("A + B : ");
		for(row=0; row<3; row++){
			for(col=0; col<3; col++) {
				System.out.print(" \t"+(matrixA[row][col]+matrixB[row][col]));
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		System.out.println("A - B : ");
		for(row=0; row<3; row++){
			for(col=0; col<3; col++) {
				System.out.print(" \t"+(matrixA[row][col]-matrixB[row][col]));
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		System.out.println("A x B : ");
		for(row=0; row<3; row++){
			for(col=0; col<3; col++) {
				matrixC[row][col]=0;
				for( int k = 0; k<3; k++) {
				matrixC[row][col] += matrixA[row][k]*matrixB[k][col];
				}
				System.out.print(" \t"+matrixC[row][col]);
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		System.out.println("A / B : ");
		for(row=0; row<3; row++){
			for(col=0; col<3; col++) {
				System.out.print(" \t"+(matrixA[row][col]/matrixB[row][col]));
			}
			System.out.println();
		}
	}

}
