package Collection;

import java.util.Stack;

public class StackEx {
	public static void main(String args[]){
		Stack<String> stack = new Stack<>();

		//push() method adds the element in the stack
		//and pop() method removes the element from the stack
		stack.push("Chaitanya"); //["Chaitanya"]
		stack.push("Ajeet"); //["Chaitanya", Ajeet]
		stack.push("Hari"); //["Chaitanya", "Ajeet", "Hari"]
		stack.pop(); //removes the last element
		stack.push("Steve"); //["Chaitanya", "Ajeet", "Steve"]
		stack.push("Carl"); //["Chaitanya", "Ajeet", "Steve", "Carl"]
		stack.pop(); //removes the last element

		System.out.println("Stack elements: ");
		for(String str: stack){
			System.out.println(str);
		}
	}
}
