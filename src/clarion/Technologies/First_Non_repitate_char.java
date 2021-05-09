package clarion.Technologies;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_repitate_char {

	public static void main(String[] args) {
		String str="streess";
		Map<Character, Integer> hm=new LinkedHashMap<>();
		char arr[] =str.toCharArray();

		for(char c:arr){
			
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}else{
				if(c==' '){
					continue;
				}
				hm.put(c, 1);
			}
		}
		for (char c:arr){
			if(c==' '){
				continue;
			}
			if(hm.get(c)==1){
				System.out.println("First non repeated characted in String is:  "+c);
				break;
			}
		}
	}

}
