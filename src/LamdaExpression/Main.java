package LamdaExpression;

interface stringFunction {
	String run(String str);
}

public class Main {
	private static void printFormate(String str, stringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}

	public static void main(String[] args) {
		stringFunction exclaim = (s) -> s + "!";
		stringFunction ask = (s) -> s + "?";
		
		printFormate("Hello" + exclaim, ask);
		
	}
	
}
