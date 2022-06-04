package ArrayList;

public class LinkedList {
	public static void main(String[] args) {
		java.util.LinkedList<String> cars = new java.util.LinkedList<String>();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.addFirst("Adding First");
	    cars.addLast("Adding Last");
	    cars.removeFirst();
	    cars.removeLast();
	    cars.getLast();
	    System.out.println(cars);
	}
}
