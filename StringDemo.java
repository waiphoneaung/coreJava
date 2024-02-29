package coreClass;

public class StringDemo {
	public static void main(String[] args) {
		String text = "\u0041. Java \\ String\n"
				+ "\tString in java are \"immutable\" .\n";
				
				
				/*
				 * Escape characters in String
				 * \n = line feed
				 * \t = tab
				 * \' = single quote character
				 * \" = double quote character
				 * \r = carriage return
				 * \f = form feed
				 * \b = back space
				 * \\ = backslash
				 * */
		
		
		char c = '\'';
		System.out.println(text);
		
		text = "String in java";
		//		0123456789abcd
		System.out.println("Length: "+ text.length());
		
		
		c = text.charAt(0);
		System.out.println("first char: "+ c);
		
		char arr[] =  text.toCharArray();
		System.out.println("contains 'ring' : "+ text.contains("ring"));
		
		int i = text.indexOf("i", 8);
		//search i start from index 4
		System.out.println("index of i: "+ i);
		
		i = text.lastIndexOf("a", 12);
		System.out.println("index of a : "+ i);
		
		String t = text.toLowerCase();
		System.out.println("Lowercase: "+ t);
		System.out.println("Original: "+ text);
		
		t = text.toUpperCase();
		System.out.println("Upper: " + t);
		
		t = text.replaceAll("java" , "Python");
		System.out.println(t);
		
		t = text.substring(10); // beginIndex
		System.out.println(t);
		
		
		t = text.substring(3,3);
		// beginIndex, end index(exclusive)
		System.out.println(t);
		
		t = " java string\t\n";
		System.out.println("Trim: " + t.trim());
		System.out.println("startswith: " + text.startsWith("String"));
		
		t = "";
		System.out.println("empty?: "+t.isEmpty());
		
		t = "java";
		System.out.println("equal: "+ t.equals("Java"));
		System.out.println("equal ignore case : " + t.equalsIgnoreCase("Java"));
		
		t = "apple, orange, banana";
		String[] fruits = t.split(",");
		for (String f : fruits) {
			System.out.println(f);
		}
		
		
				
		
	}
}
