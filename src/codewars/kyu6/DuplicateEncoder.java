package codewars.kyu6;

import java.util.HashMap;

public class DuplicateEncoder {
	
	static String encode(String word){
		String[] wordArr = word.toLowerCase().split("");
		
		String answer = "";
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String a : wordArr) {
			if(hm.containsKey(a)) {
				hm.replace(a,hm.get(a)+1);
			}else {
				hm.put(a,1);
			}
		}
		
		for(String a : wordArr) {
			answer+=hm.get(a)==1?"(":")";
		}
			
	    return answer;
	  }

}
