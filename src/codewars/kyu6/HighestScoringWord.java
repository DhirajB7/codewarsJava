package codewars.kyu6;

import java.util.*;

public class HighestScoringWord {

	public static String high(String s) {
		
		if(s==null || s.length()==0) {
			return "";
		}
		
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put(" ", -1);

		for (char i = 'a'; i <= 'z'; i++) {
			String key = String.valueOf(i);
			hm.put(key, key.hashCode() - 96);
		}

		List<Integer> sNumber = Arrays.stream(s.split("")).map(a -> hm.get(a)).toList();

		int maxSum = Integer.MIN_VALUE;

		int index = 0;
		
		int maxIndex = 0 ;

		int sum = 0;

		for (int a : sNumber) {

			if (a == -1) {

				if (sum > maxSum) {
					maxSum = sum;
					maxIndex = index;
				}

				sum = 0;
				index++;

			} else {
				sum += a;
			}

		}
		
		if (sum > maxSum) {
			maxSum = sum;
			maxIndex = index;
		}

		return s.split(" ")[maxIndex];
	}

	public static void main(String[] args) {
		System.out.println(high("man i need a taxi up to ubud"));
		System.out.println(high("what time are we climbing up to the volcano"));
		System.out.println(high(""));
	}

}
