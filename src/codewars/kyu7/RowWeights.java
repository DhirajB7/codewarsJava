package codewars.kyu7;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RowWeights {

	public static int[] rowWeights( int[] weights) {
		int[] answer = {0,0};
		
		Map<Boolean, IntSummaryStatistics> collect = IntStream.range(0, weights.length).boxed().
		collect(Collectors.partitioningBy(i->i%2==0,Collectors.summarizingInt(i->weights[i])));
		
		System.out.println(collect.get(true).getSum());
		System.out.println(collect.get(false).getSum());
		
		return answer;
	}
	
	public static void main(String[] args) {
		
	int[] weights = {80};
	
	System.out.println(Arrays.toString(rowWeights(weights)));
		
	}

}
