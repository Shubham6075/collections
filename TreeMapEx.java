package Collection.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	// TreeMap: It stores its elements in a red-black tree. The elements of TreeMap
	// are sorted in ascending order.It is substantially slower than HashMap

	public static void main(String[] args){

		TreeMap<Integer,String> map =new TreeMap<>();

		// add key and value pairs
		map.put(6156,"Govind");
		map.put(6121,"Parveen");
		map.put(6504,"Atul");
		map.put(6096,"Deepak");
		map.put(6051,"Nitin");
		map.put(6097,"Sumit");

		// print Tree Map elements
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry m = (Map.Entry) iterator.next();
			System.out.print("key is: " + m.getKey() + " & Value is: ");
			System.out.println(m.getValue());
		}
	}
}
