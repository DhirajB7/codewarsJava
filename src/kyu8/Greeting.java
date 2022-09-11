package kyu8;

public class Greeting {

    static String greet(String name, String owner) {
        return "Hello " + (name.equals(owner) ? "boss" : "guest");
    }
}
