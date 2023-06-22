package Collection;

import java.util.*;
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();

		// adding elements
		arr.add("Shubham");
		arr.add("Yash");
		arr.add("Bablu");

		// inserting element at first position(Or Index 0)
		arr.add(0, "Sumit");

		System.out.println("ArrayList Elements : ");

		// traversing through enhanced for loop
		for (String str : arr) {
			System.out.println(str);
		}

		System.out.println();

		// using for loop
		System.out.println("Using For Loop : ");
		for (int counter = 0; counter < arr.size(); counter++) {
			System.out.println(arr.get(counter));
		}

		System.out.println();

		//  Looping Array List using Iterator
		System.out.println("Using Iterator :");
		Iterator iter = arr.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println();

		// removing elements
		arr.remove(0);
		System.out.println(arr);

	}
}
/*
		1) add( Object o): This method adds an object o at the end of the arraylist.

        arr.add("hello");
        This statement would add a string hello in the arraylist at last position.

        2) add(int index, Object o): It adds the object o at the specified index in the ArrayList.

        arr.add(2, "bye");
        It will add the string “bye” at the 2nd index (third element as array list starts with index 0)
        of array list.

        3) remove(Object o): Removes the object o from the ArrayList.

        arr.remove("Chaitanya");
        This statement will remove the string “Chaitanya” from the ArrayList.

        4) remove(int index): Removes element from a given index.

        arr.remove(3);
        It would remove the element of index 3 (4th element of the list – List starts with o).

        5) set(int index, Object o): Used for updating an element. It replaces the element present
        at the specified index with the object o.

        arr.set(2, "Tom");
        It would replace the 3rd element (index =2 is 3rd element) with the value Tom.

        6) int indexOf(Object o): Gives the index of the object o. If the element is not found in the
         list then this method returns the value -1.

         int pos = arr.indexOf("Tom");
         This would give the index (position) of the string Tom in the list.

        7) Object get(int index): It returns the object of list which is present at the specified index.

        String str= arr.get(2);
        This would return the string stored at 3rd position (index 2) and would be assigned to
        the string “str”. We are using string variable to store the get() result because
        the list is of string type. If the list is of int type then we can use int variable
        to store the returned element.

        8) int size(): It returns the size of the ArrayList (Number of elements of the list).

        int number of items = arr.size();

        9) boolean contains(Object o): It checks whether the given object o is present in the array
        list. If the element is found it returns true else it returns false.

        arr.contains("Steve");
        It would return true if the string “Steve” is present in the list else we would get false.

        10) clear(): It is used for removing all the elements of the array list in one go.
                    The below code will remove all the elements of ArrayList whose object is obj.

         arr.clear();
		 */
