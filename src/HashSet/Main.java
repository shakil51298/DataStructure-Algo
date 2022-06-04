package HashSet;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<>();
		cars.add("Volvo");
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Mazda");
//		System.out.println(cars.contains("Volvo"));
		System.out.println(cars.remove("Volvo"));
		System.out.println(cars.size());
		
		for (String i : cars) {
			System.out.println(i);
		}

	}
}
