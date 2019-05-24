package Structures;

import java.util.*;

public class TheQueue {

	public void add(Queue<String> que, String element) {
		
		que.add(element);
	}
	
	public void remove(Queue<String> que) {
		
		String remove_element = que.remove();
		
		System.out.println("Element Removed: " +remove_element);
		
	}
	
	public void peek(Queue<String> que) {
		
		String peek_element = que.peek();
		
		System.out.println("Peek Element: "+ peek_element);
		
	}
	
	
	public boolean search(Queue<String> que, String ele) {
		
		// String storage element
		
		String storage_elem;
		
		// Get Queue size
		
		int queue_size = que.size();
		
		try {
			
			for(int i=0; i < queue_size; i++) {
				
				// Remove items from queue
				
				storage_elem =  que.remove();
				
				if(storage_elem == ele) {
					
					return true; 
				}
			}
			
			return false;
			
		} catch(Exception exe) {
			
			return false;
			
		}				
		
	}
	
	public static void main(String[] args) {
		
		// Class object
		
		TheQueue object = new TheQueue();
		
		// Create Queue Object
		
		Queue<String> queue = new LinkedList<>();
		
		
		// Add items to queue
		
		object.add(queue, "Apples");
		object.add(queue, "Pears");
		object.add(queue, "Pineapples");
		
		// Display Queue elements
		
		System.out.println("Queue Elements: " + queue);
		
		// Remove items from queue
		
		object.remove(queue);
		
		// Display Queue elements
		
		System.out.println("Queue Elements: " + queue);
		
		
		// Find items in queue
		
		boolean result = object.search(queue, "Pears");
		
		if(result) {
			
			System.out.println("Queue item was found");
		
		} else {
			
			System.out.println("Queue item couldn't be found");
		}
	}

}
