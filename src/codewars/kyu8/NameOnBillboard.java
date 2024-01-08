package codewars.kyu8;

public class NameOnBillboard {
	
	public static int billboard(String name, int price) {
		int answer = 0 ;

		for(int i = 0 ; i < name.length();i++) {
			answer+=price;
		}

	    return answer;
	  }

}
