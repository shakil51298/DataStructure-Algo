package Stack;

import java.util.Stack;

class Main{
	private static void pushElement(Stack<Integer> stk, int value) {
		stk.push(value);
		System.out.println("push ==>: "+ value);
		System.out.println("Stack =>: "+ stk);
	}
	
	private static void popElement(Stack<Integer> stk) {
		Integer x = stk.pop();
		System.out.println("Pop ==> : " + x);
		System.out.println("Stack =>: " + stk);
		
	}
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		pushElement(stk, 20);
		pushElement(stk, 50);
		
		popElement(stk);
	}
	
}