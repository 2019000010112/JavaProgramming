package PracticeDay24;

public class StringConversionPmitiveObject {
	public static void main(String []args) {
		
		//using toString from any other type
		int numberOne = 10;		
		String fromNumber = Integer.toString(numberOne);
		System.out.print(fromNumber);
		
		//parse using to convert string values 		
		String age = "25";
		Double ageInNumber = Double.parseDouble(age);
		System.out.println(ageInNumber);
		
		
	}

}
