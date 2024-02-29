package coreClass;

import java.util.Scanner;

public class MindGame {
	public static void main(String[] args) {
		String random = generate4DigitRandom();
		String input;
		Scanner sc = new Scanner(System.in);
		int chance = 8;
		boolean win = false;
		System.out.println("The game win generate 4 digit number.");
		System.out.println("You have "+ chance+ " chances to guess.");
		
		while (!win && chance>0) {
			System.out.println("Guess: ");
			input = sc.nextLine();
			String result = check(random, input);
			System.out.println(result);
			chance--;
			win = random.equals(input);//result.equals(****);
			System.out.println("You have " + chance+ " chances left.");
		}
		if (win) {
			System.out.println("Congrat you win...");
		} else {
			System.out.println("Sorry try again...");
			System.out.println("random number is '" + random +"'. ");
		}
	sc.close();
}					  
	
	
	public static String generate4DigitRandom() {
		int r = 0 + (int) (Math.random()*1000);
		
		return String.format("%04d", r);
	}
	public static String check(String random, String input) {
		String s = "";
		for (int i = 0; i < input.length() && i<random.length(); i++) {
			char u = input.charAt(i);
			char r = random.charAt(i);
			
			if (u ==r ) {//same place, same no
				s += "*";
				
			}else if (random.contains(u+"")) {//diff place same no exit
				
				s+= "!";
				
			}
			
		}
		return s;
	}
}
