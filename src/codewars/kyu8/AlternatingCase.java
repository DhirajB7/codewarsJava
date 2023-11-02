package codewars.kyu8;

public class AlternatingCase {

    public static String toAlternativeString(String string) {
        StringBuilder answer = new StringBuilder();

        for (char a : string.toCharArray()) {
           String aString = String.valueOf(a);
           if(aString.matches("[a-z]")){
               answer.append(aString.toUpperCase());
           }else if(aString.matches("[A-Z]")){
               answer.append(aString.toLowerCase());
           }else{
               answer.append(aString);
           }
        }

        return answer.toString();
    }


    public static void main(String[] args) {
        System.out.println(toAlternativeString("Hello World"));
    }

}
