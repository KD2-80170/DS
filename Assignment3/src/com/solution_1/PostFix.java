package com.solution_1;

import java.util.*;

public class PostFix {

	public static int findValue(int num1, int num2, char opr) {
		switch (opr) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		}
		return -1;
	}

	public static int evaluatePostFix(String s) {
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ele = s.charAt(i);

			if (Character.isDigit(ele)) {
				int number = 0;
				int j = i;
				while (s.charAt(j) != ',') {
					number = (number * 10) + (s.charAt(j) - '0');
					j++;
				}
				st.push(number);
				i=j;
			} else if (s.charAt(i) == ',') {

			} else {
				int num2 = st.pop();
				int num1 = st.pop();

				int ans = findValue(num1, num2, ele);
				st.push(ans);	
			}
		}
		return st.pop();
	}

	public static void main(String[] args) {
//		String s="456*3/+9+7-";

		String s = "400,300,100,*+";
		int ans = evaluatePostFix(s);

		System.out.println(ans);
	}
}
