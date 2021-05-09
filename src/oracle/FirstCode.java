package oracle;

import java.util.ArrayList;
import java.util.List;

public class FirstCode {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		findList(arrList);
		System.out.println(arrList);
		
		String str="Oracle";
		addString(str);
		System.out.println(str);
		

	}

	private static void addString(String str) {
		str = str +"india"; 
		
	}

	private static void findList(List<Integer> list) {
		list.add(10);
		list.add(20);
		
	}

}
