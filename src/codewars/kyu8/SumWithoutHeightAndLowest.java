package codewars.kyu8;

public class SumWithoutHeightAndLowest {

	public static int sum(int[] numbers) {

		if (numbers == null || numbers.length <= 1) {
			return 0;
		} else {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int sum = 0;

			for (Integer a : numbers) {
				if (a > max) {
					max = a;
				}

				if (a < min) {
					min = a;
				}

				sum += a;
			}

			return sum - min - max;

		}

	}

	public static void main(String[] args) {
		System.out.println(sum(new int[] { 1, 1, 11, 2, 3 }));
	}

}
