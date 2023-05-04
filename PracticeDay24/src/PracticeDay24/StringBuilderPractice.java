package PracticeDay24;

public class StringBuilderPractice {
	public static void main(String []args) {
		StringBuilder STR = new StringBuilder ("Sajedul Islam");
		
		System.out.print(STR);
		
		
		///OOP
		//Wrapper class practice
		//primitive-->object
		int number = 30;
		
		Integer numberTwo = number; //new numberTwo.valueOf(number);
		
		System.out.println(numberTwo);
		
		Double d = new Double(10.25);
		double e = d.doubleValue();
		System.out.println(e);
	}

}
