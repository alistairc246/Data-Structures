package Structures;

import java.util.*;

public class TheArray {
	
	public void add(ArrayList<String> list, String element) {
		
		list.add(element);
	}
	
	public void remove(ArrayList<String> list, int index) {
		
		
		String removed_element = list.remove(index);
		
		System.out.println("Removed Element: "+ removed_element);		
		
	}

	public static void main(String[] args) {
		
		// Create class object
		
		TheArray arr = new TheArray();
		
		// Create ArrayList 
		
		ArrayList<String> lister = new ArrayList<>();
		
		// Add elements to ArrayList
		
		arr.add(lister, "Monday");
		arr.add(lister, "Tuesday");
		arr.add(lister, "Wednesday");
		arr.add(lister, "Thursday");
		arr.add(lister, "Thursday");
		arr.add(lister, "Friday");
		arr.add(lister, "Saturday");
		arr.add(lister, "Sunday");
		
		// Display elements of Array List
		
		System.out.println("ArrayList Contains: "+ lister);
		
		// Remove elements from ArrayList: select index to remove element
		// N.B - index starts at 0

		arr.remove(lister, 5);
		
		// Display elements of Array List
		
		System.out.println("ArrayList Contains: "+ lister);
		
	}

}
