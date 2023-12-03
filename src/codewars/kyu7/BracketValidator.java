package codewars.kyu7;

import java.util.Stack;

public class BracketValidator {

	public void validate(String bracket) {

		Stack<Character> stack = new Stack<Character>();
		
		int stringSize = bracket.length();

		for (int i = 0; i < bracket.length(); i++) {
			
			stringSize-=1;

			Character data = bracket.charAt(i);

			if (data == ')') {

				if(breakLoop(stack,'(')) break;

			} else if (data == '}') {

				if(breakLoop(stack,'{')) break;

			} else if (data == ']') {

				if(breakLoop(stack,'[')) break;

			} else {
				stack.push(data);
			}

		}

		System.out.println(stack.size() == stringSize ? "Valid" : "Invalid");

	}
	
	public boolean breakLoop(Stack<Character> stack,Character c) {
		
		if(stack.size()>0 && stack.peek() == c) {
			stack.pop();
			return false;
		}else {
			return true;
		}
		
	}

	public static void main(String[] args) {

		BracketValidator bv = new BracketValidator();
		bv.validate("(){}[]");
		bv.validate("(()()){{{}}}[[][][[]]]");
		bv.validate("(){{{}[]");
		bv.validate("]]]]]");
		bv.validate("]]]][[[[[[[]");
		bv.validate("]]]]]");

	}
}
