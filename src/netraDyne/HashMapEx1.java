package netraDyne;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		
		Map<String , Integer> m = new HashMap<>();
		m.put("Jay",4535);

		m.put("Jay",123);

		m.put("k1", 123);

		m.put("k1", 456);
		
		

		m.put("k1", 456);
		Set s= m.keySet();
		System.out.println("List of key: "+s);
		 Collection c= m.values();
		 
		 System.out.println("List of Values: "+c);
		System.out.println(m);



	}

}
