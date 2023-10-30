package codewars.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineNumbering {

    public static List<String> number(List<String> lines) {

        List<String> answers = new ArrayList<String>();

        for (int i = 1; i <= lines.size(); i++) {
            answers.add(String.valueOf(i) + ": " + lines.get(i - 1));
        }

        return answers;
    }

    public static void main(String[] args) {
        System.out.println(number(Arrays.asList()));
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }
}