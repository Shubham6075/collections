package Collection.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHahMapEx {

	// LinkedHashMap: It maintains insertion order.

	public static void main(String[] args){
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

		// adding values
		map.put(1,"Shubham");
		map.put(2,"Yash");
		map.put(3,"Ankur");
		map.put(4,"Aman");
		map.put(5,"Aditya");
		map.put(6,"Ritik");
		map.put(7,"Manoj");
		map.put(8,"Naveen");

		// printing the values
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry m = (Map.Entry)iterator.next();
			System.out.print("key is: "+ m.getKey() + " & Value is: ");
			System.out.println(m.getValue());
		}
	}
}
