package codewars.kyu8;

import java.util.HashMap;

public class SwitchItUp {
	
	public static String switchItUp(int number){
		
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(0, "Zero");
		mp.put(1, "One");
		mp.put(2, "Two");
		mp.put(3, "Three");
		mp.put(4, "Four");
		mp.put(5, "Five");
		mp.put(6, "Six");
		mp.put(7, "Seven");
		mp.put(8, "Eight");
		mp.put(9, "Nine");
		
	    return mp.get(number);
	  }

}
