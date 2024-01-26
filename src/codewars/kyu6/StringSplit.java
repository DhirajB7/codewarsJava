package codewars.kyu6;


import java.util.*;

public class StringSplit {

	public static String[] solution(String s) {

		s = s.length() % 2 == 0 ? s : s + "_";

		ArrayList<String> answer = new ArrayList<String>();

		for (int i = 0; i < s.length() ; i = i + 2) {
			
			answer.add(s.substring(i,i+2));
		}

		return answer.toArray(new String[0]);
	}

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution("abc")));
		System.out.println(Arrays.toString(solution("abcd")));
		
		
	}
	
}
