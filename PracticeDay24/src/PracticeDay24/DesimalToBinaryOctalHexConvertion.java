package PracticeDay24;
import java.util.Scanner;
public class DesimalToBinaryOctalHexConvertion {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		//converting decimal number to binary, octal, hex using wrapper class
		
		
		System.out.print("Please enter your desimal number : ");
		int decilamNumber = input.nextInt();
		String BinaryNumber = Integer.toBinaryString(decilamNumber);
		System.out.print("\n Your binary number is : "+BinaryNumber);
		
		String OctalNumber = Integer.toOctalString(decilamNumber);
		String HexNumber = Integer.toHexString(decilamNumber);
		System.out.print(" \n Your Octal number is : "+OctalNumber);
		System.out.print(" \n Your Hex number is : "+HexNumber);
		
		//converting binary, octal, hex values to decimal number
		
		System.out.print("\n Please enter your Binary Number: ");
		String FromBinaryNumber = input.next();
		
		Integer BinaryToDecimal = Integer.parseInt(FromBinaryNumber, 2);
		System.out.print("\n Your Decimal Number is: "+BinaryToDecimal);
		
		System.out.print("\n Please enter your Octal Number: ");
		String FromOcalNumber = input.next();
		Integer OctalToDecimal = Integer.parseInt(FromOcalNumber, 8);
		System.out.print("\n Your Decimal Number is: "+OctalToDecimal);
		
		System.out.print("\n Please enter your Hex Number: ");
		String FromHexNumber = input.next();
		Integer HexToDecimal = Integer.parseInt(FromHexNumber, 16);
		System.out.print("\n Your Decimal Number is: "+HexToDecimal);
	}

}
