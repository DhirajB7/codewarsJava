package codewars.kyu6;

import java.util.Arrays;

public class SumOfDigits {

	public static int digital_root(int n) {
		if(String.valueOf(n).length()==1) {
			return n;
		}else {
			int newN = Arrays.stream(String.valueOf(n).split("")).mapToInt(a->Integer.valueOf(a)).sum();
			return digital_root(newN);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(digital_root(16));
		System.out.println(digital_root(493193));
	}

}
