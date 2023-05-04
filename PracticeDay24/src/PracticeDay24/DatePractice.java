package PracticeDay24;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class DatePractice {
	public static void main(String []args) {
		Date date = new Date();
		//System.out.print(date);
		
		DateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
		
		String formatDate = dateformat.format(date);
		System.out.println(formatDate);
		
		//Time getting using LocalTime class
		
		LocalTime currentTime = LocalTime.now();		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		String FormattedCurrentTime = currentTime.format(formatter);
		System.out.print(FormattedCurrentTime);
	}

}
