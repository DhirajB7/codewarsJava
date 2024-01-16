package codewars.kyu6;

public class SpinWords {

	public String spinWords(String sentence) {
		String answer = "";
		String[] arraySentance = sentence.split(" ");
		for(String word : arraySentance) {
			if(word.length() >= 5 ) {
				StringBuffer sb = new StringBuffer(word);
				word = sb.reverse().toString();
			}
			answer = answer + " " + word ;
		}
		return answer.trim();
	  }
	
	public static void main(String[] args) {
		System.out.println(new SpinWords().spinWords("This is another test"));
	}
	
}
