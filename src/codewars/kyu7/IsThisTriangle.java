package codewars.kyu7;

public class IsThisTriangle {
	
	public static boolean isTriangle(int a, int b, int c){
		boolean f1 = (a + b) > c;
		boolean f2 = (b + c) > a ;
		boolean f3 = (c + a) > b ;
	    return f1 && f2 && f3;
	  }
	
	public static void main(String[] args) {
		
		System.out.println(isTriangle(1, 2, 2));
		
	}

}
