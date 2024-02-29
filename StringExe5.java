package coreClass;

import java.util.Scanner;

public class StringExe5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text: ");
		String text = sc.nextLine();
		
		if(isPalindrome(text)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palidrome");
		}
	}
	
	public static boolean isPalindrome(String text){
	//	madam dad racecar
		text = text.toLowerCase().replace(" ", "");
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(text);
			sb.reverse();
			String rv = sb.toString();
			System.out.println(rv);
			return text.equals(rv);
//was is a car or a cat i saw
			//Borrow or rob
			// Never odd or even 
	}
}
