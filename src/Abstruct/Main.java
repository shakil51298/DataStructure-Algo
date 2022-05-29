package Abstruct;

abstract class Animal{
	public abstract void AnimalSound(); 
	public void sleep() {
	    System.out.println("Zzz");
	  }
}

class Pig extends Animal{
	public void AnimalSound() {
		System.out.println("this is Pig Sound: wee weee");
	}
}


class Main{
	public static void main(String[] args) {
		Pig absBoj = new Pig();
		absBoj.AnimalSound();
		absBoj.sleep();
	}
}