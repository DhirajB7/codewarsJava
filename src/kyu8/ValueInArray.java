package kyu8;

import java.util.Arrays;

public class ValueInArray {

    public static boolean check(Object[] a, Object x) {
       return Arrays.stream(a).toList().contains(x);
    }

}
