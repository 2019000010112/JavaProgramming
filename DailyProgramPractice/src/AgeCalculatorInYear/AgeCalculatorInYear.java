package AgeCalculatorInYear;
import java.util.Scanner;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.Date;
public class AgeCalculatorInYear {
	public static void main(String []args) {
		int getBornYear, CurrentAge;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your Born year in number : ");
		getBornYear = input.nextInt();
		
		int currentYear = Year.now().getValue();
		int currentMonth = MonthDay.now().getMonthValue();
		System.out.print("Currently this is "+currentYear);
		
		CurrentAge = getBornYear - currentYear;
		//CurrentAge = Math.abs(currentYear);
		System.out.print("\nYour current age is : "+Math.abs(CurrentAge));
		return;
		
	}

}
