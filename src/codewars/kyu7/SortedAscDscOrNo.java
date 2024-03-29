package codewars.kyu7;

import java.util.stream.IntStream;

public class SortedAscDscOrNo {

	public static String isSortedAndHow(int[] array) {

		
		if (IntStream.range(0, array.length-1).allMatch(i->array[i]<=array[i+1])) {
			return "yes, ascending";
		} else if (IntStream.range(0, array.length-1).allMatch(i->array[i]>=array[i+1])) {
			return "yes, descending";
		} else {
			return "no";
		}

	}

}
