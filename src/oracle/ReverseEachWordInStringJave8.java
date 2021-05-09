package oracle;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInStringJave8 {

	public static void main(String[] args) {
		 String str = "Welcome to Jayram"; 
		 String result=Arrays.asList(str.split(" "))
				 .stream().map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
		 System.out.println(result);
	}

}
