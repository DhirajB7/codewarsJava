package kyu8;

import java.util.Arrays;

public class DoubleArray {

    public static int[] map(int[] arr) {

        return Arrays.stream(arr).map( a -> a*2).toArray();

    }

}
