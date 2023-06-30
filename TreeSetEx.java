package Collection;

import java.util.TreeSet;
public class TreeSetEx {
	public static void main(String[] args){

		TreeSet<String> set = new TreeSet<>();

		//add method
		set.add("6075");
		set.add("6133");
		set.add("6097");
		set.add("6114");
		set.add("6121");
		set.add("6500");
		set.add("6068");

		// traversing through enhanced for loop
		for (String s : set) {
			System.out.println(s);
		}

		System.out.println();

		// removing element
		set.remove("6094");
		System.out.println(set);

		System.out.println();

		// checking element is there or not
		System.out.println(set.contains("6500"));

		System.out.println();

		// get size
		System.out.println(set.size());

		System.out.println();

		// clear all element
		set.clear();
		System.out.println(set);
	}
}
