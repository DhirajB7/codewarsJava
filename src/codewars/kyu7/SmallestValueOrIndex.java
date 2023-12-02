package codewars.kyu7;

public class SmallestValueOrIndex {

	public static int findSmallest(final int[] numbers, final String toReturn) {

		int index = Integer.MAX_VALUE;

		int value = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < value) {
				value = numbers[i];
				index = i;
			}

		}

		return toReturn == "index" ? index : value;

	}

	public static void main(String[] args) {

	}

}
