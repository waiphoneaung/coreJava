package coreClass;

import java.util.StringJoiner;

public class CollectingString {
	public static void main(String[] args) {
		char c[] = {'i','t','p','e','c'};
		StringBuilder sb = new StringBuilder();
		for ( char d : c) {
			sb.append(d);
		}
		String result = sb.toString();
		System.out.println(result);
			sb.reverse();
			System.out.println(sb.toString());
//StringJoiner sj = new StringJoiner (",");
			//delimiter
			
	StringJoiner sj = new StringJoiner("|","(",")");
		//delimiter, prefix, suffix
	for (char d : c) {
		sj.add(d+"");
	}
		System.out.println(sj.toString());
	}
}
