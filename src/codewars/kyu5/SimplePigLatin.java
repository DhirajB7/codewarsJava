package codewars.kyu5;

public class SimplePigLatin {

	public static String pigIt(String str) {

		String[] strArray = str.split("[ ]+");
		
		String answer = "";
		
		for(String a : strArray) {
			if(a.matches("[a-zA-Z]+")) {
				answer+=a.substring(1, a.length())+a.substring(0,1)+"ay"+" ";
			}else {
				answer+=a+" ";
			}
		}
		
		return answer.trim();
	}
	
	public static void main(String[] args) {
		System.out.println(pigIt("My name is Dhriaj Dhirajb7 !"));
	}

}
