package coreClass;

import java.time.Duration;
import java.time.LocalDateTime;

public class UsingDateNTime {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime lastChristmas = LocalDateTime.of(2022, 12,25,9,20);
		System.out.println(lastChristmas);
		
		Duration d = Duration.between(lastChristmas, now);
		
		System.out.println("days: " + d.toDays());
		System.out.println("Hours: " + d.toHours()%24);
		System.out.println("Min: " + d.toMinutes()%60);
		System.out.println("sec:  " + d.getSeconds()%60);
		
	}
}
