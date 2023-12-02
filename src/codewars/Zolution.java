package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zolution {
	
	public static void main(String[] args) {
 
		int[] array = {0,1,2,3,4,5};
		
		Map<Boolean, IntSummaryStatistics> collect = Arrays.stream(array).boxed().collect(Collectors.partitioningBy(i-> i%2==0,Collectors.summarizingInt(a->a)));
		
		System.out.println(collect.get(true).getSum());
		
	}

}
