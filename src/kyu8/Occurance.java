package kyu8;

public class Occurance {

    public static int strCount(String str, char letter) {
        return str.replaceAll("[^"+String.valueOf(letter)+"]","").length();
    }

}
