package coreClass;

public class StringExe3 {
	public static void main(String[] args) {
		String text ="String in java. Java is OOP. JAVA starts at 1995.";
		text = text.toLowerCase();
		
		int index = text.indexOf("java");
		int count = 0;
		while (index > -1) {
			count ++;
			System.out.printf("index: %d, count: %d%n", index, count);
			index = text.indexOf("java", index+1);
		}
		System.out.println("Count: "+count);
	}
}
