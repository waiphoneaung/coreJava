package coreClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {
	public static void main(String[] args) {
		
		/*
		 * y - year
		 * M - Month
		 * d- Day of Months
		 * M |MM - Month name short
		 * MMMM - Month name
		 * d - day of month
		 * E - day of Week
		 * default = yyyy-MM-dd
		 * 
		 * */
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("M/d/y");
		LocalDate today = LocalDate.now();
		System.out.println("F1 : " + today.format(f1));
		
		String input = ("8/10/2001");
		LocalDate date = LocalDate.parse(input,f1);
		System.out.println("Parsed: " + date);
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd MMMM yyyy EEEE");
		System.out.println("F2: " + today.format(f2));
		
		LocalTime now = LocalTime.now();
		System.out.println("Default: " + now);
		
		
		/*
		 * h - 12 hour format
		 * H - 24 hour format
		 * m - minute
		 * s - sec
		 * S - fraction of Sec
		 * a = am pm*/
		
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("hh-mm-ss.S a");
		System.out.println("F3: " + now.format(f3) );
		
		DateTimeFormatter f4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
		System.out.println("F4 : " + today.format(f4));
		
		DateTimeFormatter f5 = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println("f5: " + now.format(f5));
		
				
	}
}
