package saggezza;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SndHighestFromBigSentence {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the biggest String: ");
		String str=sc.nextLine();
		System.out.println(bigestrepeatedWord(str));
	}
	public static String 	bigestrepeatedWord(String str){
		
		String strArray[]=str.split(" ");
		int len=strArray.length;
		Map<String,Integer> hm=new HashMap<>();
		for(int i=0;i<len;i++){
			if(hm.containsKey(strArray[i])){
				
				hm.put(strArray[i], hm.get(strArray[i])+1);
			}else{
				hm.put(strArray[i], 1);
			}
		}
		System.out.println(hm);
	
		// Create set to iterate over HashMap 
		Set<Map.Entry<String, Integer> > set=hm.entrySet();
		String key="";
		int value=0;
		for(Map.Entry<String, Integer>me:set){
			 // Check for word having highest frequency 
			if(me.getValue()>value){
				value=me.getValue();
				key=me.getKey();
			}
		}
		return key;
	}

}
