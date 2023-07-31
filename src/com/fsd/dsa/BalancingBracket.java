package com.fsd.dsa;

import java.util.Stack;
import java.util.Scanner;


public class BalancingBracket {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter a string: ");  
		String bracketExpression= sc.nextLine(); 
		System.out.print("You have entered: "+bracketExpression);    
		System.out.println();           
 
		boolean result;

		result = isBracketBalanced(bracketExpression);
		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
	}

	private static boolean isBracketBalanced(String bracketExpression) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < bracketExpression.length(); i++) {
			Character ch = bracketExpression.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				stack.push(ch);
			else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty())
					return false;
				stack.pop();
			}

		}
		return stack.isEmpty() ? true : false;
	}

}


