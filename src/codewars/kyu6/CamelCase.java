package codewars.kyu6;

import java.util.*;

public class CamelCase {

	static String toCamelCase(String s) {
		String[] sArray = s.split("[_-]+");
		String[] answer = new String[sArray.length];
		answer[0] = sArray[0];
		for (int i = 1 ; i < sArray.length ; i++) {
			answer[i] = String.valueOf(sArray[i].charAt(0)).toUpperCase() + sArray[i].substring(1).toLowerCase();
		}
		
		return Arrays.stream(answer).reduce((a, b)->a+b).get();
	}
	
	public static void main(String[] args) {
		System.out.println(toCamelCase("my-Name-is_Dhiraj"));
	}

}
