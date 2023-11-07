package codewars.kyu6;

import java.util.PriorityQueue;

public class AreSame {

	public static boolean comp(int[] a, int[] b) {

		if ( a==null || b==null || a.length != b.length ) {
			return false;
		} else {
			
			boolean flag = true;
			
			PriorityQueue<Integer> aPq = new PriorityQueue<>();
			
			for(int aa:a) {
				aPq.add(aa*aa);
			}
			
			PriorityQueue<Integer> bPq = new PriorityQueue<>();
			
			for(int bb:b) {
				bPq.add(bb);
			}
			
			for(int i = 0 ; i < a.length ; i++) {
				int aa = aPq.poll();
				int bb = bPq.poll();
				if(aa!=bb) {
					flag = false;
					break;
				}
			}
			
			return flag;
		}

	}
	
	public static void main(String[] args) {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		System.out.println(comp(a,b));
	}

}
