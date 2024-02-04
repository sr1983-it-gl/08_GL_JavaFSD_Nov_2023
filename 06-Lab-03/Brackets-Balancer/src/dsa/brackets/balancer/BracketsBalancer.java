package dsa.brackets.balancer;

import java.util.Set;

public class BracketsBalancer {

	String expression;
	
	public BracketsBalancer(String expression) {
	
		this.expression = expression;
	}
	
	public void check() {
		
		// Stack<Character> stack;
		
		//  (  [  [  {  }  ]  ]  )
		
		// Visit each character from the expression
		
		// for-character
			// open-bracket
				// push()
			// close-bracket
				// pop()
				// check between
					// popped-out item [open-bracket-char] // {
					// visited item [closed-bracket-char // }
	}
	
	Set<Character> getOpenBrackets(){
		
		// LinkedHashSet -> Order
		// HashSet -> No Order
		// <, {, [, (
		
		
	}
	
	Set<Character> getClosedBrackets(){
		
		// >, ], }, )
	}
	
	Character getClosedBracketChar(Character openBracketChar) {
		
		
	}
}
