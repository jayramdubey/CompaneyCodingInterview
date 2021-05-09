package com.cleri5;

import java.util.Stack;

public class FilePathCorrectWithCollectionStack {

	public static void main(String[] args) {
		String str = "/tmp/./abc/../pqr/test.txt";
		StringBuffer result = outputFun(str);
		System.out.println(result);
	}

	private static StringBuffer outputFun(String str) {
		Stack<String> stack = new Stack<>();
		String[] str1 = str.split("/");
		int len = str1.length;
		for (int i = 0; i < len; i++) {
			stack.push(str1[i]);
		}

		StringBuffer result = pop(stack, len);
		String res = result.toString();
		String resRev[] = res.split("/");
		StringBuffer res1 = new StringBuffer();
		for (int i = resRev.length - 1; i >= 0; i--) {
			res1.append("/" + resRev[i]);
		}

		return res1;
	}

	private static StringBuffer pop(Stack<String> stack, int len) {

		if (stack.empty()) {
			return null;
		}
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < len; i++) {

			if (stack.empty()) {
				break;
			}
			if (stack.peek().equals("..")) {
				stack.pop();
				stack.pop();

			} else if (stack.peek().equals(".")) {
				stack.pop();
			} else if (stack.peek().equals("")) {
				stack.pop();
			} else {
				sb.append(stack.pop() + "/");
			}
		}
		return sb;

	}

}
