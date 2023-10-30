package codewars.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FakeBinary {

    public static String fakeBin(String numberString) {
       return Arrays.stream(numberString.split("")).filter(a -> a.length()==1).map(a -> Integer.parseInt(a) < 5 ? "0" : "1" ).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
        System.out.println(fakeBin(""));
    }

}
