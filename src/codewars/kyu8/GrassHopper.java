package codewars.kyu8;

import java.util.stream.IntStream;

public class GrassHopper {

    public static int summation(int n) {

        return IntStream.rangeClosed(1,n).sum();

    }

    public static void main(String[] args) {
        System.out.println(summation(8));
        System.out.println(summation(2));
        System.out.println(summation(3));
    }
}