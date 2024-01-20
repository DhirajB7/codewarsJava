package codewars.kyu8;

public class FindTheFirstNonConsecutiveNumber {

	static Integer find(final int[] array) {
		if (array == null || array.length <= 1) {
			return null;
		} else {
			Integer answer = null;
			int seq = array[0];
			for(int a : array) {
				if(seq==a) {
					seq++;
				}else {
					answer = a;
					break;
				}
			}
			return answer;
		}
	}

}
