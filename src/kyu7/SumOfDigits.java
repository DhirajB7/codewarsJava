package kyu7;

public class SumOfDigits {

    public static int sumOfDigits(int n) {
        int sum = 0;
        String[] digits = String.valueOf(n).split("");
        for (String a : digits) {
            sum += Integer.parseInt(a);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }

}
