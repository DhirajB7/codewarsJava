package codewars.kyu8;

import java.util.TreeSet;

public class SortAndStar {

	public static String twoSort(String[] s) {
		
		String answer = "";

		TreeSet<String> ts = new TreeSet<String>();

		for (String a : s) {
			ts.add(a);
		}

		String[] fw = ts.first().split("");
		
		for(String a : fw) {
			answer += a+"***";
		}

		return answer.substring(0, answer.length()-3);
	}
	
	public static void main(String[] args) {
		System.out.println(twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
	}

}
