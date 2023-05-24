package kyu6;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueNumber {

	public static double findUniq(double arr[]) {

		Map<Double, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			double data = arr[i];
			if (map.containsKey(data)) {
				map.put(data, map.get(data) + 1);
			} else {
				map.put(data, 1);
			}
		}

		
		double answer = map.entrySet().stream().sorted((a,b)->a.getValue().compareTo(b.getValue()))
		.map(a->a.getKey()).toList().get(0);

		return answer;
	}

}
