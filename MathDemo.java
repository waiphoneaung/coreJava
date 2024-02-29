package coreClass;

public class MathDemo {
public static void main(String[] args) {
	System.out.println("PI: " +Math.PI);
	System.out.println("E: "+ Math.E);
	int r = Math.min(5, 8);
	System.out.println("Min 5,8: " + r);
	
	System.out.println("Max: " + Math.max(3.5, 3.2));
	System.out.println("abs" + Math.abs(-3));
	System.out.println("Power: "+ Math.pow(3.5, 2.7));
	System.out.println("Sqrt: "+ Math.sqrt(25));
	System.out.println("Round: "+ Math.round(3.5));
	System.out.println("Floor: " + Math.floor(3.5 ));
	System.out.println("Ceil: " + Math.ceil(3.1));
	System.out.println("random: " + Math.random()); //0- 1.0
	
	int  dice = 1 + (int) (Math.random()*5);
	System.out.println("Dice : "+ dice);
	System.out.println("Radian 180: " + Math.toRadians(180));
	
	System.out.println("Sin: " + Math.sin(.5));
	System.out.println("H: " + Math.hypot(3, -3));
	System.out.println("log: " + Math.log(16));
	
}
}
