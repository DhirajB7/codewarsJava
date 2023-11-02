package codewars.kyu6;

import java.util.Arrays;

public class BuildTower {

	public static String[] towerBuilder(int nFloors) {
		String[] answer = new String[nFloors];
		int fixedLength = 2*nFloors-1;
		for(int i = 0 ; i < nFloors ; i++) {
			int numberOfSpace = (fixedLength/2)-i;
			int numberOfStars = fixedLength - 2*numberOfSpace;
			answer[i] = " ".repeat(numberOfSpace)+"*".repeat(numberOfStars)+" ".repeat(numberOfSpace);
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(towerBuilder(1)));
		System.out.println(Arrays.toString(towerBuilder(3)));
		System.out.println(Arrays.toString(towerBuilder(6)));
		System.out.println(Arrays.toString(towerBuilder(10)));
		System.out.println(Arrays.toString(towerBuilder(2)));
	}

}
