package codewars.kyu7;

public class NextSquare {

    public static long findNextSquare(long sq) {

        long answer = -1;

        if (Long.parseLong(String.valueOf(Math.sqrt(sq)).split("\\.")[1]) == 0) {
            long value = (long) Math.sqrt(sq);
            answer = (long) Math.pow(value + 1, 2);
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Long.parseLong(String.valueOf(Math.sqrt(122)).split("\\.")[1]) == 0);

    }

}
