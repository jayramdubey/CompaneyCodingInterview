package com.cleri5;

import java.util.HashMap;
import java.util.Map;

public class MinimumNoOfDel {

	public static void main(String[] args) {
      // int num[]={2,1,3,2,3,4};
		 int num[]={2,3,3,1,3,3,4,4,3};
     int result = minimumDel(num);
     System.out.println(result);
	}

	private static int minimumDel(int[] arr) {
		Map<Integer, Integer>hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i])+1);
			else
				hm.put(arr[i], 1);
		}
		int result =0;
		for(Integer key : hm.keySet()){
			Integer value = hm.get(key);
			if(key > value){
				result += value;
			}else if(value > key){
				result += value-key;
			}
		}
		return result;
	}

}
