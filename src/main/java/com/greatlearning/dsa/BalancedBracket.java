package com.greatlearning.dsa;

import java.util.Stack;

public class BalancedBracket {

	public static boolean isBalanced(String input) {

		// declare a Stack
		Stack<Character> stack = new Stack<>();

		// for loop to input character
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}

			char check;
			switch (ch) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;
			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;
			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return stack.empty();

	}
}