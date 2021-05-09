package com.Lowes;

import java.util.LinkedHashMap;
import java.util.Map;

public class LastRepitateChar {

	public static void main(String[] args) {
		String str = "horizona university";
		char arr[] = str.toCharArray();
		int len = arr.length;
		Map<Character, Integer> hm = new LinkedHashMap<>();
		for (char c : arr) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				if(c==' '){
					continue;
				}
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		for(int i=len-1;i>0;i--){
			if(arr[i]==' '){
				continue;
			}
			if(hm.get(arr[i])>1){
				System.out.println("Last repited char "+arr[i]);
				break;
			}
			
		}
		
	}
}
