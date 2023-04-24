package com.greatlearning.dsa;

import java.util.Scanner;

public class Clientcode {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("Enter the input or press q to quit");

			String input = sc.next();

			if (input.equals('q')) {
				flag = false;
				continue;
			}

			boolean result = BalancedBracket.isBalanced(input);
			System.out.println("The entered String has Balanced Brackets " + result);
		}
		sc.close();

	}
}