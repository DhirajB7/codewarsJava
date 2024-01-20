package codewars;

public class Zolution {

	public static void main(String[] args) {
		
		String sen = "Hello My name is      Dhiraj";
		
		String[] senArr = sen.split("");
		
		String answer = "";
		
		for(String a : senArr) {
			answer = a+answer;
		}
		
		System.out.println(answer);
		
	}

}
