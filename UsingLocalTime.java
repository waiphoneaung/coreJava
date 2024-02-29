package coreClass;

import java.time.Duration;
import java.time.LocalTime;

public class UsingLocalTime {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("NOW: " + now);
		System.out.println("Hr: " + now.getHour());
		System.out.println("Min: " + now.getMinute());
		System.out.println("Sec: " + now.getSecond());
		System.out.println("Nano: " + now.getNano());
		
		
		LocalTime start = LocalTime.of(14, 30,40,22333);
										//hour, minutes, second, nanosecond
		System.out.println("Local: " + start);
		
		LocalTime end = start.plusMinutes(90);
		System.out.println("End: " + end);
		
		System.out.println("Equals: " + now.equals(start));
		System.out.println("B4: " + now.isBefore(start));
		System.out.println("after: " + now.isAfter(start));
		
		Duration d = Duration.between(now, end);
		System.out.println(d);
		System.out.println("Hour: "+ d.toHours());
		System.out.println("Minutes: " + d.toMinutes());
		System.out.println("Second: " + d.getSeconds());
		
		String time = "08:30:50";
		LocalTime t = LocalTime.parse(time);
		System.out.println(t);
				
		
	}
}
