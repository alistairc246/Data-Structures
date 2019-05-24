package Structures;

import java.util.*;

public class TheStack {
	
	public TheStack() {}
	
	public void push(Stack<String> stack, String elem) {
		
		stack.push(elem);
		
	}
	
	public void pop(Stack <String> stack) {
		
		// Convert to String
		
		String element = (String) stack.pop();
		
		System.out.println("Popped Off Element: "+ element);
	}
	
	public void peek(Stack <String> stack) {
		
		// Convert to String
		
		String peek_ele = (String) stack.peek();
		
		System.out.println("Peek Element: "+ peek_ele);
		
	}
	
	public String search(Stack<String> stack, String element) {
		
		String error = "Element couldn't been found!";
		String success = "Element was found";
		int stack_size = stack.size();
		
		try {
	         		
			for(int i=0; i <= stack_size; i++) {
				
				String elem = (String) stack.pop();
				
				if (elem == element) {
					
					return success; 			
				}
			}
			
			return error; 
		
		} catch(EmptyStackException exe) {
			
			return error; 		
		}
	}

	public static void main(String[] args) {
		
		// Create stack object
		
		Stack <String> pile = new Stack<>();
		
		TheStack object = new TheStack();
		
		// Push items
		
		object.push(pile, "Mary");
		object.push(pile, "Mars");
		object.push(pile, "June");
		
		// Display stack elements
		
		System.out.println("Stack Elements: "+ pile);
		
		// Pop items

		object.pop(pile);
		
		// Display stack elements
		
		System.out.println("Stack Elements: "+ pile);
		
		// Get peek element
		
		object.peek(pile);
		
		// Find Element
		
		System.out.println(object.search(pile, "June"));
	}

}
