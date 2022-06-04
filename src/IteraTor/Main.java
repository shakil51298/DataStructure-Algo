package IteraTor;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		Iterator<String> it = cars.iterator();
//		removing
		while(it.hasNext()){
			if(it.next()== "") {
				it.remove();
			}
		}
		System.out.println(cars);

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	
	}
}
