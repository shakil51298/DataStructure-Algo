package HashMap;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		// Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    HashMap<String, Integer> alls = new HashMap<String, Integer>();
	    alls.put("age", 22);
	    alls.put("shakiol", 20);
	    
	    for (String index : capitalCities.keySet()) {
			System.out.println("Keys are: " +index + ", values: " + capitalCities.get(index));
		}
	 
	    System.out.println(capitalCities.get("England"));
	}
}
