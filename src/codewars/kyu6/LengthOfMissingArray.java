package codewars.kyu6;

import java.util.TreeSet;

public class LengthOfMissingArray {

	public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {

		if (arrayOfArrays == null) {
			return 0;
		}

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int i = 0; i < arrayOfArrays.length; i++) {
			if (arrayOfArrays[i] == null || arrayOfArrays[i].length == 0) {
				return 0;
			} else {
				ts.add(arrayOfArrays[i].length);
			}
		}

		if (ts.size() == 0) {
			return 0;
		}

		int value = ts.first();

		for (int a : ts) {
			if (value == a) {
				value++;
			} else {
				break;
			}
		}

		return value;

	}

	public static void main(String[] args) {

//		System.out.println(getLengthOfMissingArray(new Object[][] { new Object[] { 1, 2 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }} ));
//		System.out.println(getLengthOfMissingArray(new Object[][] { new Object[] { 5, 2, 9 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }} ));
//		System.out.println(getLengthOfMissingArray(new Object[][] { new Object[] { null }, new Object[] { null, null, null } } ));
//		System.out.println(getLengthOfMissingArray(new Object[][] { new Object[] { 'a', 'a', 'a' }, new Object[] { 'a', 'a' }, new Object[] { 'a', 'a', 'a', 'a' }, new Object[] { 'a' }, new Object[] { 'a', 'a', 'a', 'a', 'a', 'a' }} ));
		System.out.println(getLengthOfMissingArray(new Object[][] { new Object[] {}, new Object[] { 1, 4, 0 },
				new Object[] { 1, 2 }, new Object[] { 'a' }, new Object[] { 'a', 'a', 'a', 'a', 'a', 'a' } }));
		System.out.println(getLengthOfMissingArray(new Object[][] {}));
	}

}
