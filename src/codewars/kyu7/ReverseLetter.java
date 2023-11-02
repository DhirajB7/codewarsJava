package codewars.kyu7;

public class ReverseLetter {

    public static String reverseLetter(final String str) {
        StringBuilder answer = new StringBuilder(str);
        answer.reverse();
        return answer.toString().replaceAll("[^A-Za-z]","");
    }

    public static void main(String[] args) {
        String name = "Dh232ira778830j";

        System.out.println(name.replaceAll("[^A-Za-z]",""));
    }

}
