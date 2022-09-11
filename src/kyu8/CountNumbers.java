package kyu8;

import java.util.Arrays;

public class CountNumbers {

    public static int[] countBy(int x, int n) {

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (i+1) * x;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1,10)));
    }

}
