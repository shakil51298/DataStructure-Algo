import java.util.*;  

public class Stack {
	private static void push(LinkedList<Integer> stk) {
		System.out.println("Please enter e value you wannt to insert: ");
		Scanner newScan = new Scanner(System.in);
		stk.push(newScan.nextInt());
		System.out.println("Updated Stack is: " + stk);

	}
	
	private static void pop() {
		System.out.println("Pop");
	}
	
	private static void menuData() {
		System.out.println("Press 1, to select push");
		System.out.println("Press 2, to select pop");
	}
	
	public static void main(String[] args) {
		menuData();
		LinkedList <Integer> stk = new LinkedList<>(); 
		Scanner scanMenu = new Scanner(System.in);
		int selectMenu = scanMenu.nextInt();
		switch(selectMenu) {
		case 1:
			push(stk);
			break;
		case 2:
			pop();
			break;
		}
		
	}
}
