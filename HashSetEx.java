package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args){

		HashSet<String> set = new HashSet<>();

		// add method()
		set.add("Suresh");
		set.add("Rohit");
		set.add("Sanket");
		set.add("Govind");
		set.add("Parveen");
		set.add("Gaurav");

        // traversing by using iterator
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println();

		// remove() method
		set.remove("Rohit");
		System.out.println(set);

		System.out.println();

		// contains() method
		System.out.println(set.contains("Sanket"));

		System.out.println();

		// getting size of set
		System.out.println(set.size());

		System.out.println();

		// checking if it is empty or not
		System.out.println(set.isEmpty());

		System.out.println();

	}
}
