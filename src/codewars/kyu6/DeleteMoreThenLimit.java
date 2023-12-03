package codewars.kyu6;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class DeleteMoreThenLimit {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		
		if(maxOccurrences==0) {
			return new int[0];
		}else {
			

		LinkedHashMap<Integer, Integer> occoruanceData = new LinkedHashMap<Integer, Integer>();

		LinkedList<Integer> al = new LinkedList<Integer>();

			for (int a : elements) {
				if (occoruanceData.containsKey(a)) {
					if (occoruanceData.get(a) < maxOccurrences) {
						al.add(a);
					}
					occoruanceData.put(a, occoruanceData.get(a) + 1);
				} else {
					al.add(a);
					occoruanceData.put(a, 1);
				}
			}
		
		int[] answer = new int[al.size()];

		for (int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i);
		}
		
		return answer;
		}
	}

	public static void main(String[] args) {
//		System.out.println(Arrays.toString(deleteNth(new int[] { 20, 37, 20, 21 }, 1)));
//		System.out.println(Arrays.toString(deleteNth(new int[] { 1, 2, 3, 1, 2, 1, 2, 3 }, 2)));
//		System.out.println(Arrays.toString(deleteNth(new int[] { 1, 2, 3, 1, 2, 1, 2, 3 }, 1)));
//		System.out.println(Arrays.toString(deleteNth(new int[] {1,2,3,1,2,1,2,3}, 0)));
		System.out.println(Arrays.toString(deleteNth(new int[] {4,1,1,1,2}, 0)));
//		System.out.println(Arrays.toString(deleteNth(new int[] {44, 46, 42, 31, 8, 12, 4, 25, 33, 3, 2, 14, 41, 46, 45, 7, 25, 9, 23, 44, 10, 36, 5, 23, 0, 22, 4, 3, 20, 14, 41, 20, 12, 5, 26, 17, 25, 0, 34, 12, 12, 1, 21, 2, 37, 28, 32, 29}, 0)));
	}

}
