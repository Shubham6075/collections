package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String args[]){

		LinkedList<String> list=new LinkedList<String>();

		//Adding elements to the Linked list
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");

		//Adding an element to the first position
		list.addFirst("Negan");

		//Adding an element to the last position
		list.addLast("Rick");

		//Adding an element to the 3rd position
		list.add(2, "Glenn");

		//Iterating LinkedList
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		System.out.println();

		//Removing First element
		//Same as list.remove(0);
		list.removeFirst();

		//Removing Last element
		list.removeLast();

		//Iterating LinkedList
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}

		System.out.println();

		//removing 2nd element, index starts with 0
		list.remove(1);

		System.out.print("\nAfter removing second element: ");
		//Iterating LinkedList again
		Iterator<String> iterator2=list.iterator();
		while(iterator2.hasNext()){
			System.out.print(iterator2.next()+" ");
		}
	}
}
/*
LinkedList<String> llistobj  = new LinkedList<String>();

1) boolean add(Object item): It adds the item at the end of the list.

llistobj.add("Hello");
It would add the string “Hello” at the end of the linked list.

2) void add(int index, Object item): It adds an item at the given index of the the list.

llistobj.add(2, "bye");
This will add the string “bye” at the 3rd position( 2 index is 3rd position as index starts with 0).

3) boolean addAll(Collection c): It adds all the elements of the specified collection c to the list.
It throws NullPointerException if the specified collection is null. Consider the below example –

LinkedList<String> llistobj = new LinkedList<String>();
ArrayList<String> arraylist= new ArrayList<String>();
arraylist.add("String1");
arraylist.add("String2");
llistobj.addAll(arraylist);
This piece of code would add all the elements of ArrayList to the LinkedList.

4) boolean addAll(int index, Collection c): It adds all the elements of collection c to the
                                            list starting from a give index in the list.
                                            It throws NullPointerException if the collection c is
                       null and IndexOutOfBoundsException when the specified index is out of the range.

llistobj.add(5, arraylist);
It would add all the elements of the ArrayList to the LinkedList starting from position 6 (index 5).

5) void addFirst(Object item): It adds the item (or element) at the first position in the list.

llistobj.addFirst("text");
It would add the string “text” at the beginning of the list.

6) void addLast(Object item): It inserts the specified item at the end of the list.

llistobj.addLast("Chaitanya");
This statement will add a string “Chaitanya” at the end position of the linked list.

7) void clear(): It removes all the elements of a list.

llistobj.clear();

8) Object clone(): It returns the copy of the list.

For e.g. My linkedList has four items: text1, text2, text3 and text4.

Object str= llistobj.clone();
 System.out.println(str);
Output: The output of above code would be:

[text1, text2, text3, text4]

9) boolean contains(Object item): It checks whether the given item is present in the list or not.
                                 If the item is present then it returns true else false.

boolean var = llistobj.contains("TestString");
It will check whether the string “TestString” exist in the list or not.

10) Object get(int index): It returns the item of the specified index from the list.

Object var = llistobj.get(2);
It will fetch the 3rd item from the list.

11) Object getFirst(): It fetches the first item from the list.

Object var = llistobj.getFirst();

12) Object getLast(): It fetches the last item from the list.

Object var= llistobj.getLast();

13) int indexOf(Object item): It returns the index of the specified item.

llistobj.indexOf("bye");

14) int lastIndexOf(Object item): It returns the index of last occurrence of the specified element.

int pos = llistobj.lastIndexOf("hello);
integer variable pos will be having the index of last occurrence of string “hello”.

15) Object poll(): It returns and removes the first item of the list.

Object o = llistobj.poll();

16) Object pollFirst(): same as poll() method. Removes the first item of the list.

Object o = llistobj.pollFirst();

17) Object pollLast(): It returns and removes the last element of the list.

Object o = llistobj.pollLast();

18) Object remove(): It removes the first element of the list.

llistobj.remove();

19) Object remove(int index): It removes the item from the list which is present at the specified index.

llistobj.remove(4);
It will remove the 5th element from the list.

20) Object remove(Object obj): It removes the specified object from the list.

llistobj.remove("Test Item");

21) Object removeFirst(): It removes the first item from the list.

llistobj.removeFirst();

22) Object removeLast(): It removes the last item of the list.

llistobj.removeLast();

23) Object removeFirstOccurrence(Object item): It removes the first occurrence of the specified item.

llistobj.removeFirstOccurrence("text");
It will remove the first occurrence of the string “text” from the list.

24) Object removeLastOccurrence(Object item): It removes the last occurrence of the given element.

llistobj.removeLastOccurrence("String1);
It will remove the last occurrence of string “String1”.

25) Object set(int index, Object item): It updates the item of specified index with the give value.

llistobj.set(2, "Test");
It will update the 3rd element with the string “Test”.

26) int size(): It returns the number of elements of the list.

llistobj.size();
 */
