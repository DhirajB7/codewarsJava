package codewars.kyu6;

public class FindTheParityOutliner {
	
	static int find(int[] integers) {
		int oddCount = 0;
		int oddNumber = 0;
		
		int evenCount = 0;
		int evenNumber = 0;
		
		int answer = 0;
		
		for(int a : integers) {
			if(a%2==0) {
				evenCount++;
				evenNumber = a;
			}else {
				oddCount++;
				oddNumber = a;
			}
			
			if((evenCount > 0 && oddCount > 0) && (evenCount > 1 || oddCount > 1)) {
				answer = evenCount==1 ? evenNumber : oddNumber;
				break;
			}
		}
		
	    return answer;
	  }
	
	public static void main(String[] args) {
		
		System.out.println(find(new int[] {2, 4, 0, 100, 4, 11, 2602, 36}));
		System.out.println(find(new int[] {160, 3, 1719, 19, 11, 13, -21}));
		
	}

}
