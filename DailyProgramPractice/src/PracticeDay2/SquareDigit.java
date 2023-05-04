package PracticeDay2;
import java.util.Scanner;
public class SquareDigit {
	public static void main(String []args) {
		int i, convertToNumber=0;
		String concatNumber="";
		
//		int array[] = new int [5];
		Scanner input = new Scanner(System.in);
//		System.out.print("Please enter your digit to get square output : ");
//		for (i=0; i<array.length; i++){
//		    array[i]=input.nextInt();
//		}
//		System.out.print("The values you provided are :"+array[i]);
		
		System.out.print("Please enter your digit :" );
		int n = input.nextInt();
		int m = n;
		String string_number = Integer.toString(m);
		 for (i = 0; i < string_number.length(); i++) {
			 int number = string_number.charAt(i)-'0';
			 //int digitMulti =Integer.parseInt(String.valueOf(i));
			 
			 int digitMultisum = number * number;
			 concatNumber = concatNumber.concat(Integer.toString(digitMultisum));
			 convertToNumber = Integer.parseInt(concatNumber);
	        }	
		 System.out.print("The concat value is :" +convertToNumber);
	}

}
