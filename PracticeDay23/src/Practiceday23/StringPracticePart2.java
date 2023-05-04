package Practiceday23;

public class StringPracticePart2 {
	public static void main(String []args) {
		String firstName = "Sajedul";
		String lastName = " Islam";
		
		String fullName = firstName + lastName; //method1 to add 2 string
		System.out.print("Hello! "+fullName);
		
		String fullNameMethod2 = firstName.concat(lastName); //method1 to add 2 string
		System.out.print("\n Hello! "+fullNameMethod2);
		
		String fullNameUpperCase = fullNameMethod2.toUpperCase(); //method1 to convert string uppercase
		System.out.print("\n Hello! "+fullNameUpperCase);
		
		String fullNameLowerCase = fullNameMethod2.toLowerCase();//method1 to convert string loweCase
		System.out.print("\n Hello! "+fullNameLowerCase);
		
		boolean stringCheck = firstName.startsWith("Sa");
		System.out.print(stringCheck);
		
		boolean stringCheck2 = lastName.endsWith("m");
		System.out.print(stringCheck2);
	}

}
