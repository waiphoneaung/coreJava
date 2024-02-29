package coreClass;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class ICafe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start hour: ");
		int sh = sc.nextInt();
		System.out.print("Enter Start Minutes: ");
		int sm = sc.nextInt();
		
		System.out.print("Enter End hour: ");
		int eh = sc.nextInt();
		System.out.print("Enter Minutes: ");
		int em = sc.nextInt();
		
		LocalTime start = LocalTime.of(sh, sm);
		LocalTime end = LocalTime.of(eh, em);
		
		Duration d = Duration.between(start, end);
		long h = d.toHours();
		long m = d.toMinutes()%60;
		System.out.println(h + " hours and " + m + " Minutes.");
		
		double amount = 1000*h;
		
		if(m>30) { 
			amount += 1000;
		}else if(m > 15) {
			amount += 500;
		}
		System.out.println("You have to pay " + amount + " Kyats");
		
				
	}
}
