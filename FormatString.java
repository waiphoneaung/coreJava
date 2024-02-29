package coreClass;

public class FormatString {
	public static void main(String[] args) {
		int c = 34;
		 double avg =  121.4626;
		 String name = "9G";
		 
		 /*
		  * %s = any | Object
		  * %d = digit(int, long)
		  * %f = floating point (float, double)
		  * %e = exponent form
		  * %n = next line 
		  * %04d = 4 digit
		  * %-100s = space amount
		  */
		 
		 String msg = String.format("The average height of %04d students"+ "%nfrom %-100s class is %.1f cm.", c, name, avg);
		 
		 System.out.println(msg);
	}
}
