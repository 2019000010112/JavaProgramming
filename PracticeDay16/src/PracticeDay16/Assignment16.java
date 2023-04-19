package PracticeDay16;
import java.util.Scanner;
public class Assignment16 {
	public static void main(String[]args) {
		String username;
		String validUser="anis";
		int validPass = 123456;
		Scanner input = new Scanner(System.in);
		int count = 1;
		do {
			System.out.println("Enter username : "); 
			username = input.nextLine();
		 
			System.out.println("Enter Password : ");
			int pass = input.nextInt();
		
			if(username ==validUser || pass == validPass) {
			System.out.print("Welcome!"+username);
			count = 2;
			break;
			}
			else {
			System.out.print("Username and password is incorrect! Please try again...");
			continue;
			}

		}
		while(count ==1);

	}
	
}