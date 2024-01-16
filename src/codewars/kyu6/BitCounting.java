package codewars.kyu6;

import java.util.Arrays;

public class BitCounting {

	public static int countBits(int n) {
		return (int) Arrays.stream(Integer.toBinaryString(n).split("")).filter(a -> a.equalsIgnoreCase("1")).count();
	}

	public static void main(String[] args) {
		System.out.println(countBits(1234));
	}

}
