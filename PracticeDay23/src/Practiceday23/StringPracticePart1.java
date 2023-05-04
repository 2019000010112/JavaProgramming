package Practiceday23;

public class StringPracticePart1 {
	public static void main(String []args) {
		String name = "Sajedul Islam"; //method1
		String name_2 = new String("Sajedul Islam"); //method2
		System.out.print("Your name is "+name_2);
		
		int len = name.length();
		int len2 = name_2.length();
		
		//method1 to compaire strings
		if(len == len2) {
			System.out.print("\n Equal!");
		}
		else {
			System.out.print("\n Not Equal!");
		}
		
		//method 2 to compaire 2 string
		
		boolean stringCheck = name.equals(name_2);
		System.out.print("\n Both are equal : "+stringCheck);
	}

}
