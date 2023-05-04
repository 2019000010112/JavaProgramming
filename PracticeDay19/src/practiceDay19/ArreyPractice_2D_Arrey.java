package practiceDay19;
//import java.util.Scanner;
public class ArreyPractice_2D_Arrey {
	public static void main(String []args) {
		//int arrey;
		
		int [][] number = new int [2][3];
		number[0][0]=2;
		number[0][1]=3;
		number[0][2]=4;
		number[1][0]=5;
		number[1][1]=6;
		number[1][2]=7;
		//print arrey value convutional way
		System.out.println("Value of the arrey"+number[0][2]);
		//print 2D arrey using for loop
		for(int row = 0; row<2; row++) {
			
			for(int col = 0; col<3; col++) {
				System.out.print(" "+number[row][col]);
			}
			System.out.println();
		}
		
		

	}

}
