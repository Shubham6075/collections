package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetEx {
	public static void main(String[] args){

		LinkedHashSet<String> set = new LinkedHashSet<>();

		// add method
		set.add("Atul");
		set.add("Nitin");
		set.add("Deepak");
		set.add("Naveen");
		set.add("Narender");
		set.add("Shubham");

		// traversing through iterator
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println();

		// removing method
		set.remove("Nitin");
		System.out.println(set);

		System.out.println();

		// get the size of set
		System.out.println(set.size());

		System.out.println();

		// checking the set is empty or not
		System.out.println(set.isEmpty());

		System.out.println();

		// checking the name in set
		System.out.println(set.contains("Narender"));

		System.out.println();

		// clear the set (removing all elements from the set)
		set.clear();
		System.out.println(set);
	}
}
