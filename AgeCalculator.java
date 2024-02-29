package coreClass;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate today = LocalDate.now();
		
		System.out.println("Enter your Birthday: ");
		String text = sc.nextLine();
		LocalDate dob = LocalDate.parse(text);
		
		
		if(dob.isBefore(today)) {
			Period age = Period.between(dob, today);
			System.out.printf("You are now %d years, %d months and %d days old",age.getYears(), age.getMonths(), age.getDays());
		}else {
			System.out.println("Invalid Date");
		}
		
		
		/*if (dob.isAfter(today)) {
			System.out.println("You was not born");
		}else if (dob.equals(today)){
			System.out.println("You was born today!!");
		}
		
		else{
			System.out.println("Years: "+ age.getYears());
			System.out.println("Months: "+age.getMonths());
			System.out.println("Days: "+age.getDays());
			
		}*/
		
		
		sc.close();
	}
}
