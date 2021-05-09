package subex;

import java.util.Stack;

public class StringNumberToNumber {

	public static void main(String[] args) {
		String str="12345";
		reverse(str);
	}

	private static void reverse(String str) {
		char ch[]=str.toCharArray();
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<ch.length;i++){
			int res=ch[i]-'0';
			st.push(res);
		}
		
		while(!st.isEmpty()){
			System.out.print(" "+st.pop());
		}
	}

}
