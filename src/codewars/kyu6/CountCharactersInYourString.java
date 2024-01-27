package codewars.kyu6;

import java.util.*;

public class CountCharactersInYourString {

	public static Map<Character, Integer> count(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character a : str.toCharArray()) {
			if(map.containsKey(a)) {
				map.replace(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		return map;
	}

}
