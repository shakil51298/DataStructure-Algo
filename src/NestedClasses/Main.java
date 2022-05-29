package NestedClasses;

public class Main {

	int x = 5;

	class innerClass {
		int y = 10;
	}

	public static void main(String[] args) {
		Main outerObj = new Main();
		Main.innerClass innerObj = outerObj.new innerClass();
		System.out.println(outerObj.x + innerObj.y);
	}
}
