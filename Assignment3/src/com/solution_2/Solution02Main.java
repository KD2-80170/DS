package com.solution_2;

import java.util.Scanner;
import java.util.Stack;

public class Solution02Main {

	public static void maxValueStack() {
		Stack<Integer> st = new Stack<>();
		Scanner in = new Scanner(System.in);

		int choice;
		while (true) {
			System.out.println("0.Exit \n1.Push");
			System.out.print("Enter Choice : ");
			choice = in.nextInt();
			if (choice == 0)
				break;
			System.out.print("Enter Element :");
			int ele = in.nextInt();

			if (st.isEmpty())
				st.push(ele);
			else {
				if (ele > st.peek())
					st.push(ele);
				else {
					Stack<Integer> temp = new Stack<>();
					while (!st.isEmpty() && ele < st.peek()) {
						temp.push(st.pop());
					}
					st.push(ele);
					while (!temp.isEmpty()) {
						st.push(temp.pop());
					}
				}
			}

		}

		System.out.println("Max Value : " + st.peek());

		/*
		 * System.out.println("Elements in Stack : "); while(!st.isEmpty()) {
		 * System.out.print(st.pop()+" "); }
		 */
		in.close();

	}

	public static void main(String[] args) {

		maxValueStack();
	}

}
