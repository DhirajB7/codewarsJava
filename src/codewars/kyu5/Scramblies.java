package codewars.kyu5;

import java.util.HashMap;

public class Scramblies {
	
	  public static boolean scramble(String str1, String str2) {    
		  
		  HashMap<String, Integer> hm = new HashMap<String, Integer>();
		  
		  boolean answer = true;
		  
		  for(int i = 0 ; i < str1.length(); i++) {
			  String key = String.valueOf(str1.charAt(i));
			  if(hm.containsKey(key)) {
				  hm.put(key, hm.get(key)+1);
			  }else {
				  hm.put(key, 1);
			  }
		  }
		  
		  for(int i = 0 ; i < str2.length();i++) {
			  String key = String.valueOf(str2.charAt(i));
			  if(hm.containsKey(key)) {
				 if(hm.get(key)==0) {
					 answer = false;
					  break;
				 }else {
					 hm.put(key, hm.get(key)-1);
				 }
			  }else {
				  answer = false;
				  break;
			  }
		  }
		  
		  
	      return answer;
	    }
	  
	  public static void main(String[] args) {
		
		  System.out.println(scramble("rkqoodlw", "woorld"));
		  System.out.println(scramble("cedewaraaossoqqyt", "codewars"));
		  System.out.println(scramble("katas", "steak"));
		  
	}

}
