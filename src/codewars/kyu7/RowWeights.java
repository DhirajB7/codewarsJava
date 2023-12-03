package codewars.kyu7;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RowWeights {

	public static int[] rowWeights( int[] weights) {
		
		int[] answer = new int[2];
		
		Map<Boolean, IntSummaryStatistics> collect = IntStream.range(0, weights.length).boxed().
		collect(Collectors.partitioningBy(i->i%2==0,Collectors.summarizingInt(i->weights[i])));
		
		answer[0] = (int) collect.get(true).getSum();
		answer[1] = (int) collect.get(false).getSum();
		
		return answer;
	}
	
	public static void main(String[] args) {
		
	int[] weights = {80};
	
	System.out.println(Arrays.toString(rowWeights(weights)));
		
	}

}
