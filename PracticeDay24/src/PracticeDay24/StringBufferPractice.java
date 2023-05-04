package PracticeDay24;

public class StringBufferPractice {
	public static void main(String []args) {
		StringBuffer SB = new StringBuffer("Sajedul Islam"); //declaring stringbuffer variable 
		
		//System.out.print(SB); //printing the variable
		
		SB.append(" Loves"); //adds values to the main SB variable
		SB.append(" JAVA");
		System.out.print(SB);
		//SB.reverse(); //revers the string data
		//System.out.println();
		//System.out.print(SB);
		
		System.out.println();
		
		int len = SB.length();
		System.out.print(len);
		SB.setLength(7);
		System.out.println(SB);
		
	}

}
