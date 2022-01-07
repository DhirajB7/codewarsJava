package kyu8;

import java.util.Arrays;

public class CountingSheep {

    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(a->String.valueOf(a)=="true").count();
    }

}
