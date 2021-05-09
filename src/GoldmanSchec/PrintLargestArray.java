package GoldmanSchec;

import java.util.*;

public class PrintLargestArray {

	static void printLargest(ArrayList<String> arr) {

		int max = 0;
		int temp=0;
		for(String s:arr){
			temp = Integer.parseInt(s);
			if (max < temp) {
				max = temp;
			}
		}

/*		Iterator it = arr.iterator();
		int tmp = 0;
		while (it.hasNext()) {
			tmp = Integer.parseInt((String) it.next());
			if (max < tmp) {
				max = tmp;
			}
		}*/
		System.out.print(max);

	}

	// driver program
	public static void main(String[] args) {

		ArrayList<String> arr;
		arr = new ArrayList<>();
		// output should be 6054854654
		arr.add("54");
		arr.add("546");
		arr.add("548");
		arr.add("60");
		printLargest(arr);
	}
}