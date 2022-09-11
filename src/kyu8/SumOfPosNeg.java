package kyu8;

import java.util.Arrays;

public class SumOfPosNeg {
    public static int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) {
            return new int[0];
        } else {
            int[] sum = new int[2];
            for (int a : input) {
                if (a > 0) {
                    sum[0] += 1;
                } else {
                    sum[1] -= a;
                }
            }

            if (sum[1] > 0) {
                sum[1] = -1 * sum[1];
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(null)));
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})));
    }

}
