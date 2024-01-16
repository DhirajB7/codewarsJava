package codewars.kyu6;

import java.util.HashMap;

public class FindOdd {

	public static int findIt(int[] a) {

		int answer = 0;

		HashMap<Integer, Integer> occ = new HashMap<Integer, Integer>();

		for (int aa : a) {
			if (occ.containsKey(aa)) {
				occ.replace(aa, occ.get(aa) + 1);
			} else {
				occ.put(aa, 1);
			}
		}

		for (var entry : occ.entrySet()) {

			if (entry.getValue() % 2 == 1) {
				answer = entry.getKey();
				break;
			}

		}

		return answer;

	}

}
