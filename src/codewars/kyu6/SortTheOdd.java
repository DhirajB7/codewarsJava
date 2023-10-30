package codewars.kyu6;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortTheOdd {

	public static int[] sortArray(int[] array) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.stream(array).filter(a -> a % 2 == 1).boxed().toList());

		int[] answer = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			int data = array[i];

			if (data % 2 == 0) {
				answer[i] = array[i];
			} else {
				answer[i] = pq.poll();
			}

		}

		return answer;

	}

	public static void main(String[] args) {

		int[] data = { 5, 8, 6, 3, 4 };

		int[] data1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		System.out.println(Arrays.toString(sortArray(data)));
		System.out.println(Arrays.toString(sortArray(data1)));

	}

}
