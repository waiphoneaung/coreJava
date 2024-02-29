package coreClass;

import java.time.Duration;
import java.time.LocalTime;

public class PerformanceTest {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		m1();
		LocalTime end = LocalTime.now();
		Duration d = Duration.between(start,end);
		System.out.println(d);
	}
	public static void m1() {
		for(int i = 0; i < 10000000; i++) {
			double sq = Math.sqrt(i);
			System.out.println(sq);
		}
	}
}
