package basicTest;

import java.util.Stack;

public class Interview {
	
	public boolean parse(String s) {
		Stack stack = new Stack();
		for (int i = 0; i < s.length(); i++){
		  char c = s.charAt(i);
		  
		  if(c=='(' || c=='[')
			  stack.push(c);

		  if(c==')') {
			  char c2 = (char) stack.pop();
			  if(c2 != '(')
				  return false;
		  }

		  if(c==']') {
			  char c2 = (char) stack.pop();
			  if(c2 != '[')
				  return false;
		  }
		}

		return stack.size()==0;
	}

}
