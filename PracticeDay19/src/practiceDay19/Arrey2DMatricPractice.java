package practiceDay19;
import java.util.Scanner;

public class Arrey2DMatricPractice {
	public static void main(String []args) {
		int row, col, sum;
		
		int [][] matrixA = new int [2][3];
		int [][] matrixB = new int [2][3];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter matrix A value : ");
		for(row=0; row<2; row++) {
			for(col=0; col<3; col++) {
				System.out.printf("A[%d][%d] = ",row, col);
				matrixA[row][col] = input.nextInt();
			}
		}
		
		System.out.println("Please enter matrix B value : ");
		for(row=0; row<2; row++) {
			for(col=0; col<3; col++) {
				System.out.printf("B[%d][%d] = ",row, col);
				matrixB[row][col] = input.nextInt();
			}
		}
		
		System.out.println("Matrix A values : ");
		for(row=0; row<2; row++) {
			for(col=0; col<3; col++) {
				System.out.print(" "+matrixA[row][col]);
			}
			System.out.println();
		}
		
		System.out.println("Matrix B values : ");
		for(row=0; row<2; row++) {
			for(col=0; col<3; col++) {
				System.out.print(" "+matrixB[row][col]);
			}
			System.out.println();
		}
	}

}
