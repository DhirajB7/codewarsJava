package kyu8;

import java.util.Arrays;

public class SumOfPositive {

    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(a -> a>0).sum();
    }
}
