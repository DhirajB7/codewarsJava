package kyu6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FindUniqueNumber {

	public static double findUniq(double arr[]) {

		Map<Double, Integer> map = new HashMap<>();

		for (double data : arr) {
			if (map.containsKey(data)) {
				map.put(data, map.get(data) + 1);
			} else {
				map.put(data, 1);
			}
		}


		return map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey).toList().get(0);
	}

}
