package coreClass;

import java.util.Scanner;

public class StringExe1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String name = sc.nextLine();
		
		int is = name.indexOf(" ");
		System.out.println(is);
		
		String fname = name.substring(0,is);
		System.out.println("Frist Name: "+ fname);
		
		String lname = name.substring(is + 1);
		System.out.println("Last Name: "+ lname);
		
		sc.close();
		
	}
}
