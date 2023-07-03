package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	// HashMap is like HashSet, it does not maintain insertion order and does not sort the
	// elements in any order.

	public static void main(String[] args){
		HashMap<Integer,String> map = new HashMap<>();

		// adding values
		map.put(6075,"Shubham");
		map.put(6133,"Suresh");
		map.put(6114,"Sanket");
		map.put(6123,"Rohit");
		map.put(6115,"Naveen");
		map.put(6068,"Narender");
		map.put(6500,"Gaurav");

		// traversing
		System.out.println("HashMap elements: ");
		for(Map.Entry mEntry : map.entrySet()) {
			System.out.print("key: " + mEntry.getKey() + " & Value: ");
			System.out.println(mEntry.getValue());
		}

		System.out.println();

		// remove method
		map.remove(6123);
		System.out.println("HashMap elements: ");
		for(Map.Entry mEntry : map.entrySet()) {
			System.out.print("key: " + mEntry.getKey() + " & Value: ");
			System.out.println(mEntry.getValue());
		}

		System.out.println();

		// replace method
		map.replace(6075,"Rathee");
		map.replace(6068,"Jaglan");
		System.out.println("HashMap elements: ");
		for(Map.Entry mEntry : map.entrySet()) {
			System.out.print("key: " + mEntry.getKey() + " & Value: ");
			System.out.println(mEntry.getValue());
		}

		System.out.println();

		// size of elements
		System.out.println(map.size());
	}
}
      // # Key Methods

	/*
	1) void clear(): It removes all the key and value pairs from the specified Map.

	2) Object clone(): It returns a copy of all the mappings of a map and used for cloning
			them into another map.

	3) boolean containsKey(Object key): It is a boolean function which returns true or false
			based on whether the specified key is found in the map.

	4) boolean containsValue(Object Value): Similar to containsKey() method, however it looks
			for the specified value instead of key.

	5) Value get(Object key): It returns the value for the specified key.

	6) boolean isEmpty(): It checks whether the map is empty. If there are no key-value mapping
			present in the map then this function returns true else false.

	7) Set keySet(): It returns the Set of the keys fetched from the map.

	8) value put(Key k, Value v): Inserts key value mapping into the map. Used in the above example.

	9) int size(): Returns the size of the map – Number of key-value mappings.

	10) Collection values(): It returns a collection of values of map.

	11) Value remove(Object key): It removes the key-value pair for the specified key.
			Used in the above example.

	12) void putAll(Map m): Copies all the elements of a map to the another specified map.

	 */