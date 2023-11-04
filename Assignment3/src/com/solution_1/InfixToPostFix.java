package com.solution_1;

import java.util.Stack;

public class InfixToPostFix {

	public static int prior(char opr) {
		switch (opr) {
		case '$':
			return 3;
		case '+':
			return 1;
		case '-':
			return 1;
		case '*':
			return 2;
		case '/':
			return 2;
		}
		return 0;
	}

	public static String sol(String s) {

		Stack<Character> st = new Stack<>();
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ele = s.charAt(i);

			if (Character.isDigit(ele)) {
				ans.append(ele);
			} else if (ele == '(') {
				st.push(ele);
			} else if (ele == ')') {
				while (st.peek() != '(') {
					ans.append(st.pop());
				}
				st.pop();
			} else {
				while (!st.isEmpty() && prior(st.peek()) >= prior(ele)) {
					ans.append(st.pop());
				}
				st.push(ele);

			}
		}
		while (!st.isEmpty()) {
			ans.append(st.pop());
		}
		return ans.toString();
	}

	public static void main(String[] args) {

		String infix = "1$9+3*4-(6+8/2)+7";
		System.out.println(sol(infix));
	}

}
