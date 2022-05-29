package PolyMorphysm;

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound! ");
	}
}
class Pig extends Animal{
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}


class Main extends NameOfPerson {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		myAnimal.animalSound();
		Pig pig = new Pig();
		pig.animalSound();
		NameOfPerson objs = new NameOfPerson();
		objs.randomNumber(1, 5);
		
	}
}