package com.solution_1;

import java.util.Stack;

public class PreFix {
	
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
	
	
	public static int preFixEvaluation(String s)
	{
		Stack<Integer> st = new Stack<>();

		for (int i = s.length()-1; i >=0; i--) {
			char ele = s.charAt(i);

			if (Character.isDigit(ele)) {
				int num = ele - '0';
				st.push(num);
			} else {
				int num1 = st.pop();
				int num2 = st.pop();

				int ans = findValue(num1, num2, ele);
				st.push(ans);
			}
		}
		return st.pop();
	}
	
	public static void main(String[] args) {
		String s="-++4/*56397";;
		
		int result=preFixEvaluation(s);
		System.out.println(result);
	}
}
