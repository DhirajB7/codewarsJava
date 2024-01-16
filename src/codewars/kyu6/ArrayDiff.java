package codewars.kyu6;

import java.util.*;

public class ArrayDiff {

	public static int[] arrayDiff(int[] a, int[] b) {
		List<Integer> bList = Arrays.stream(b).boxed().toList();
		List<Integer> answer = new ArrayList<Integer>();
		
		for (int aa : a) {
			if (!(bList.contains(aa))) {
				answer.add(aa);
			}
		}
		return answer.stream().mapToInt(aa -> aa).toArray();
	}

}
