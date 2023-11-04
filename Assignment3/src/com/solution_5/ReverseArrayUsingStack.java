package com.solution_5;

import java.util.Stack;

public class ReverseArrayUsingStack {

	public static void revArray(int arr[]) {
		Stack<Integer> st = new Stack<>();
		for (int ele : arr)
			st.push(ele);

		System.out.println("Reversed Array : ");
		while (!st.isEmpty())
			System.out.print(st.pop()+" ");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		revArray(arr);
		;
	}

}
