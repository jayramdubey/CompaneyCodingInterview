package accolite_java;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Repiting_Char {
	public static void main(String[] args) {
		String str="my name is Jayram dhar dubey";
		firstRepitateChar(str);
		}
	private static void firstRepitateChar(String str) {
		char arr[]=str.toCharArray();
		Map<Character, Integer> lhm=new LinkedHashMap<>();
		for(char c:arr){
			if(lhm.containsKey(c)){
				lhm.put(c, lhm.get(c)+1);
			}else{
				lhm.put(c, 1);
			}
		}
		for(char c:arr){
			if(lhm.get(c)>1){
				System.out.println("first reapited char  "+c);
				break;
			}
		}
	}
}
