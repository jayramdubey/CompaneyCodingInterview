package netraDyne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		
		List<Integer> hs = new ArrayList<>();
		
		hs.add(3);
		hs.add(10);
		hs.add(2);
		hs.add(1);
		hs.add(4);
		hs.add(20);
		System.out.println(Collections.max(hs));
		System.out.println(Collections.min(hs));
		Collections.sort(hs);
		System.out.println(hs);
		Collections.shuffle(hs);
		System.out.println(hs);
		Collections.reverse(hs);
		System.out.println(hs);

	}

}
