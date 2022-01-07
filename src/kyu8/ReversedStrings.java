package kyu8;

public class ReversedStrings {

    public static String solution(String str) {

        String answer ="";

        for(int i = str.length()-1; i>=0 ;i--){
            answer += String.valueOf(str.charAt(i));
        }

        return answer;

    }
}
