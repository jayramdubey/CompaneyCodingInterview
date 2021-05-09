package com.cleri5;

public class FileSepratoer {

	public static void main(String[] args) {
		//String str = "/tmp/./abc/../pqr/test.txt";
		String str = "/tmp////def/.///..///////ghi/test.txt";
		String result = outputFun(str);
		System.out.println(result);
	}

	private static String outputFun(String str) {

		
		int top = 0;
		
		String strArr[] = str.split("/");
		int len = strArr.length;
		String stack[] = new String[len];
		
		for (int i = 0; i <len; i++) {
			stack[top] = strArr[i];
			top++;
		}
		StringBuilder result = pop(stack, top);
		String res=result.toString();
		String []strRev = res.split("/");
		res = "";
		for(int i=strRev.length-1;i>=0;i--){
			res += "/"+strRev[i];
		}
		return res;
	}
	private static StringBuilder pop(String[] stack, int top) {
		StringBuilder sb = new StringBuilder();
		if (top == -1) {
			return null;
		}
		top--;
		
		while (top > 0) {
			if (stack[top].equals("..")) {
				top-=2;
			} else if (stack[top].equals(".") ) {
				top-=1;
			} else if (stack[top].equals("") ) {
				top--;
			} 
			else {
				sb.append(stack[top]+"/");
				top--;
			}
		}
		return sb;
	}
}
