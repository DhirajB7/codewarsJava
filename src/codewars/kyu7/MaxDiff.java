package codewars.kyu7;

import java.util.stream.IntStream;

public class MaxDiff {

	public static int maxDiff(int[] lst) {

		return (lst == null || lst.length == 0) ? 0
				: IntStream.of(lst).max().getAsInt() - IntStream.of(lst).min().getAsInt();

	}

}
