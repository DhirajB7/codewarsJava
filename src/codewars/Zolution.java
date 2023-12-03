package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zolution {

	public static void main(String[] args) {

		List<Integer> weightList = Arrays.asList(40, 50, 60, 70, 80, 90);

		Map<Boolean, List<Integer>> collect1 = IntStream.range(0, weightList.size()).boxed()
				.collect(Collectors.groupingBy(i -> i % 2 == 0));
		Map<Boolean, IntSummaryStatistics> collect2 = IntStream.range(0, weightList.size()).boxed()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0,Collectors.summarizingInt(i->weightList.get(i))));

		System.out.println(collect1);
		System.out.println(collect2);
		
		String name = "Dhiraj";
		
		List<String> al = Arrays.stream(name.split("")).toList();
		
		System.out.println(al.stream().collect(Collectors.joining()));

	}

}
