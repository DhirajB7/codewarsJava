package codewars.kyu6;

import java.util.*;

public class SumParts {

	public static int[] sumParts(int[] ls) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		int sum = Arrays.stream(ls).sum();
		al.add(sum);

		for (int a : ls) {
			sum = sum - a;
			al.add(sum);
		}

		return al.stream().mapToInt(a -> a).toArray();
	}

}
