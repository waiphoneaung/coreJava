package coreClass;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class UsingLocalDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println("Year: " + today.getYear());
		System.out.println("Month: " + today.getMonthValue());
		System.out.println("Month: " + today.getMonth());
		System.out.println("day of month: " + today.getDayOfMonth());
		System.out.println("Day of Week: " + today.getDayOfWeek());
		System.out.println("Day of Year: " + today.getDayOfYear());
		
		LocalDate examDate = LocalDate.of(2023, 12, 3);
		System.out.println("Equals : " + today.equals(examDate));
		System.out.println("b4: " + today.isBefore(examDate));
		System.out.println("After: " + today.isAfter(examDate));
		
		LocalDate next2Week = today.plusWeeks(8);
		System.out.println("Next 2 Week: " + next2Week);
		
		Period p = Period.between(today, examDate);
		System.out.println(p);
		System.out.println("y : "+p.getYears());
		System.out.println("m : " + p.getMonths());
		System.out.println("d : " + p.getDays());
		
		LocalDate newYear = LocalDate.parse("2024-01-01");
		System.out.println("New Year: " + newYear);
		
		//my note
		System.out.println("Enter your anni Year: ");
		int y = sc.nextInt();
		System.out.println("Enter your anni month: ");
		int m = sc.nextInt();
		System.out.println("Enter your anni Day: ");
		int d = sc.nextInt();
		LocalDate annyDate = LocalDate.of(y, m, d);
		
		DateTimeFormatter fdate = DateTimeFormatter.ofPattern("E, dd/MMM/yyyy");
		String annyDay = fdate.format(annyDate);
		System.out.println("Your Anniversary Date is " + annyDay);
		Period anny = Period.between(annyDate, today);
		System.out.println("You have been together: " + anny.getYears() + " Years " + anny.getMonths() + " Months " + anny.getDays()+ " Days");
		System.out.println("You Have Been Together: "+ anny.toTotalMonths() + " Months");
		System.out.println("You Have Been Together: " + ChronoUnit.DAYS.between(annyDate, today)  + " Days");
		
	}
}
