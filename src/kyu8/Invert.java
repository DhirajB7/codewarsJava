package kyu8;

import java.util.Arrays;

public class Invert {

    public static int[] invert(int[] array) {

        return Arrays.stream(array).map(a -> a*-1).toArray();
    }

}
