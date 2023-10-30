package codewars.kyu8;

import java.util.Arrays;

public class FirstNElements {
    public static int[] take(int[] arr, int n) {
        return arr.length==0 ? new int[0] : arr.length < n ? arr : Arrays.copyOfRange(arr,0,n);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3)));
    }

}
