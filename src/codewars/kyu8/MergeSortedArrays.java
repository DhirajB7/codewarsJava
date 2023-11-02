package codewars.kyu8;

import java.util.*;

public class MergeSortedArrays {
	
	public static int[] mergeArrays(int[] first, int[] second) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		Arrays.stream(first).forEach(a -> ts.add(a));
		Arrays.stream(second).forEach(a -> ts.add(a));
		
		
		return ts.stream().mapToInt(a->a).toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
