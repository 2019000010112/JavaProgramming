
//	0
//	1	2
//	3	4	5
//	6	7	8	9

package PracticeDay20;

public class TriangleArreyPrintWith2DArrey {
	public static void main(String []args) {
		int row, col, k=0;
		
		int [][] arrey2D = new int[4][];
		
		arrey2D[0] = new int [1];
		arrey2D[1] = new int [2];
		arrey2D[2] = new int [3];
		arrey2D[3] = new int [4];
		//forloop to generate matrix
		
		for(row=0; row<4; row++) {
			for(col = 0; col<row+1; col++) {
				arrey2D[row][col] = k;
				k++;
			}
		}
		//for printing matrix 
		for(row=0; row<4; row++) {
			for(col=0; col<row+1; col++) {
				System.out.print("\t"+arrey2D[row][col]);
			}
			System.out.println(); 	
		}
		
	}

}
