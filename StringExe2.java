package coreClass;

import java.util.Scanner;

public class StringExe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter text: ");
	//	String text = sc.nextLine();
		int count = 0;
		String text = "java program java is OOP Java is coffee.";
		String java [] = text.split(" ");
	
		for (String j : java) {
			System.out.println("W: " + j);
			if (j.equalsIgnoreCase("Java") == true) {
				count ++;	
			}
		}
		System.out.println("Java count: "+ count+ "times");
		
		
		
		sc.close();
		
	}
}
