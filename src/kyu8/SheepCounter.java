package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SheepCounter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        try {
            return (int) Arrays.stream(arrayOfSheeps).filter(a -> a).toList().size();
        } catch (Exception e) {
            return 0;
        }
    }
}
