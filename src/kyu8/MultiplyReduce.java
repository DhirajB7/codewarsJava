package kyu8;

import java.util.Arrays;

public class MultiplyReduce {

    public static int grow(int[] x){

        return Arrays.stream(x).reduce((a,b)->a*b).getAsInt();

    }

}
