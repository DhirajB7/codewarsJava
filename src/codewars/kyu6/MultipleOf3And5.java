package codewars.kyu6;

import java.util.stream.IntStream;

public class MultipleOf3And5 {

	public int solution(int number) {

		return IntStream.range(1, number).filter(a -> (a % 3 == 0 || a % 5 == 0)).sum();

	}
	
	public static void main(String[] args) {
		System.out.println(new MultipleOf3And5().solution(10));
	}

}
