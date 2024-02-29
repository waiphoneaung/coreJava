package coreClass;

import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZoneAndOffset {
	public static void main(String[] args) {
		for(String id : ZoneId.getAvailableZoneIds()) {
			if(id.contains("Asia"))
				System.out.println(id);
		}
		ZoneId current = ZoneId.systemDefault();
		System.out.println("System: " + current);
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		System.out.println("Tokyo: " + tokyo);
		
		LocalTime tokyoTime = LocalTime.now(tokyo);
		System.out.println(tokyoTime);
		
		ZonedDateTime dt = ZonedDateTime.now();
		System.out.println(dt);
		
		OffsetTime ot = OffsetTime.now();
		System.out.println(ot);
		
		ZoneOffset off = ZoneOffset.of("+09:00");
		OffsetDateTime past = OffsetDateTime.of(2020, 12,5,10,2,3,0,off);
		System.out.println(past);
				
	}
}
