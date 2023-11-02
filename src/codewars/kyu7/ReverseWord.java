package codewars.kyu7;

public class ReverseWord {
    public static String reverseWords(final String original) {
        StringBuilder answer = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (char a : original.toCharArray()) {
            if (a==' ') {
                answer.append(word).append(" ");
                word.setLength(0);
            } else {
                word.insert(0, a);
            }
        }
        return word.length()==0 ? answer.toString() : answer.append(word).toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseWords("My Name is Dhiraj"));

    }

}
