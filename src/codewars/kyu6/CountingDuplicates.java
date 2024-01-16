package codewars.kyu6;

import java.util.*;

public class CountingDuplicates {

	public static int duplicateCount(String text) {
		
		HashMap<String, Integer> frq = new HashMap<String, Integer>();
		
		Arrays.stream(text.split("")).forEach(a->{
			
			String key = a.toLowerCase();
			
			if(frq.containsKey(key)) {
				frq.replace(key, frq.get(key)+1);
			}else {
				frq.put(key, 1);
			}

		});

		return (int)frq.values().stream().filter(a -> a>1).count();
	}

	public static void main(String[] args) {
		System.out.println(duplicateCount("ddddddhiraaj"));
	}
}
