//A assignment to get day name from user input
//https://github.com/anisul-Islam/java-tutorials-code/blob/master/Assignment18.java

package PracticeDay18;
import java.util.Scanner;
public class Assignment18 {
	public static void main(String[]args) {
		String [] weekDays = {"", "Monday","Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};
		String [] weekDays2 = {"Monday","Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};
		int dayName;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number (1-7):");
		dayName = input.nextInt();
		
		/*
		 * switch (dayName) { case 0: System.out.print("Not a valid Day"+weekDays[0]);
		 * break; case 1: System.out.print("Day is : "+weekDays[1]); break; case 2:
		 * System.out.print("Day is : "+weekDays[2]); break; case 3:
		 * System.out.print("Day is : "+weekDays[3]); break; case 4:
		 * System.out.print("Day is : "+weekDays[4]); break; case 5:
		 * System.out.print("Day is : "+weekDays[5]); break; case 6:
		 * System.out.print("Day is : "+weekDays[6]); break; case 7:
		 * System.out.print("Day is : "+weekDays[7]); break; default:
		 * System.out.print("Not a valid digit!"); }
		 */
		for(int i=1; i<=weekDays2.length; i++) {
			if(i==dayName) {
				System.out.print("The day is : "+weekDays2[i-1]);
				break;
			}
		}
		
	}

}
