package Structures;

import java.util.*;

public class TheLinkedList {

	public void addItems(LinkedList<Integer> list, int item) {
		
		list.add(item);
	}
	
	public void removeItems(LinkedList<Integer> list) {
		
		int removed_item = list.remove();
		
		System.out.println("Remove Item: "+ removed_item);
	}
	
	
	public boolean findItems(LinkedList<Integer> list, int num) {
		
		try {
			
			// Get size of linkedList
			
			int list_size = list.size();
			
			for(int i = 0; i <= list_size; i++) {
				
				int r_num_item = list.remove();
				
				if(r_num_item == num) {
					
					return true;
				}
			}
			
			return false;
	
		} catch(Exception e) {
			
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		// Create class object
		
		TheLinkedList link = new TheLinkedList();
		
		// Create LinkedList
		
		LinkedList <Integer> lst = new LinkedList<>();
		
		// Add items
		
		link.addItems(lst, 5);
		link.addItems(lst, 7);
		link.addItems(lst, 11);
		link.addItems(lst, 55);
		
		// Display list
		
		System.out.println("List of items: "+ lst);
		
		// Remove items
		
		link.removeItems(lst);
		
		// Display list
		
		System.out.println("List of items: "+ lst);
		
		
		// Find items
		
		boolean result = link.findItems(lst, 55);
		
		if(result) {
			
			System.out.println("Item Found!");
		
		} else {
			
			System.out.println("Item Not Found!");
		}

	}

}
