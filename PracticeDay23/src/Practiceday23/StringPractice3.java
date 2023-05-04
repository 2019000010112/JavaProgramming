package Practiceday23;

public class StringPractice3 {
	public static void main(String []args) {
		String Country = "Bangladesh in my Motherland";
		System.out.print(Country);
		
		
		char ch = Country.charAt(0);
				System.out.println("\n Ch = "+ch);
				
		int value = Country.codePointAt(0);
			System.out.println("\n Value = "+value);
			
		int position = Country.indexOf("M");
			System.out.println("\n Position = "+position);
			
		//string replace			
		String replaceString = Country.replace("my","Our");
		
		//System.out.print(replaceString);
		String replaceString2nd = replaceString.replace("in","is");
		System.out.print(replaceString2nd);
		
		//string split
		System.out.println();
		String [] splitString = replaceString2nd.split(" ");
		for(String split : splitString) {
			System.out.println(split);
		}
		
	}

}
