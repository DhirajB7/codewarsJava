package codewars.kyu8;

import java.util.Arrays;

public class LongToArray {

	public static int[] digitize(long n) {

		String[] nStr = String.valueOf(n).split("");
		
		int len = nStr.length;
		
		int[] answer = new int[len];
		
		for(int i = 0 ; i < len ; i++) {
			answer[i] = Integer.valueOf(nStr[len-1-i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(digitize(123456789)));
	}

}
