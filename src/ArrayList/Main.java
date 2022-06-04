package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
		
		cars.set(0, "Shakil"); // update-change
		//cars.remove(4); // remove
		//cars.clear(); // remove all elements
		
		System.out.println(cars.get(0)); // access an item;
		System.out.println(cars.size()); // size of array;
		// loop through an ArrayList;
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(0));
		}
		Collections.sort(cars);
		System.out.println("..............................");
//		for-each loop
		for (String index : cars) {
			System.out.println(index);
		}
		String[] carsList = {"Tesla"};
		System.out.println(carsList.length);
		
	}
}