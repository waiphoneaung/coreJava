package coreClass;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
	public static void main(String[] args) {
		int x[] = {31,52,23,44,15};
		//			0  1  2  3  4
		
		Random rd = new Random();
		for (int i = x.length - 1; i >0; i-- ) {
			int r = rd.nextInt(i+1);
			System.out.printf("i: %d, r: %d%n",i,r);
			int t = x[i];
			x[i] = x[r];
			x[r] = t;
			System.out.println(Arrays.toString(x));
		}
		}
}
