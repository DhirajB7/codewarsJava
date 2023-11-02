package codewars.kyu6;

import java.util.Arrays;

public class Persist {
	public static int persistence(long n) {
		int count = 0;
		String numberInString = String.valueOf(n);
		while(numberInString.length()>1) {
			count++;
			n = Arrays.stream(numberInString.split("")).map(a->Integer.valueOf(a)).reduce((a,b)->a*b).get();
			numberInString = String.valueOf(n);
		}
		return count; 
	}
	
	public static void main(String[] args) {
		System.out.println(persistence(39));
		System.out.println(persistence(999));
		System.out.println(persistence(7));
	}
}