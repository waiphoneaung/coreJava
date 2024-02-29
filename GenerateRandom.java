package coreClass;

import java.util.Random;

public class GenerateRandom {
	public static void main(String[] args) {
		Random rd = new Random();
		int dice = 1 + rd.nextInt(6);//start + rd.nextInt(range)
		System.out.println("1 - 6 Random: " + dice);
		System.out.println("Boolean: " + rd.nextBoolean());
		
		System.out.println("Double: " + rd.nextDouble()); // 0.0 - 1.0
		
		rd.ints(6, 5, 11).forEach(i-> System.out.println(i));
		// size, origin(inclusive) , bound(exclusive)
		 
		
	}
}
