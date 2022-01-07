package kyu8;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {

        int answer = Integer.MAX_VALUE;

        for (int a : args) {
            if (a < answer) {
                answer = a;
            }
        }

        return answer;

    }
}