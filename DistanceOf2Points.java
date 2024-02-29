package coreClass;

import java.util.Scanner;

public class DistanceOf2Points {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		double x1 = sc.nextDouble();
		
		System.out.println("Enter y1: ");
		double y1 = sc.nextDouble();
		
		System.out.println("Enter x2: ");
		double x2 = sc.nextDouble();
		
		System.out.println("Enter y2");
		double y2 = sc.nextDouble();
		
		double a = y1 - x1;
		double b = y2 - x2;
		
		double hypo = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println(hypo);
		
		System.out.println("HYPO : " +Math.hypot(a, b));
		
		sc.close();
		
		
		
	}
}
