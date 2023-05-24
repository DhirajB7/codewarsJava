package kyu7;

import java.util.Arrays;
import java.util.List;

public class Minimum {

	public static int minValue(int[] values) {

		List<String> stringValues = Arrays.stream(values).distinct().boxed().sorted().map(a -> String.valueOf(a))
				.toList();

		return Integer.parseInt(String.join("", stringValues));
	}

	public static void main(String[] args) {

		System.out.println(minValue(new int[] { 6, 7, 8, 7, 6, 6 }));

	}

}
