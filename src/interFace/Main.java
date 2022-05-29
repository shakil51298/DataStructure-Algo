package interFace;

//interface
interface Animal{
	public void animalSound() ;
	public void run();
}

class Pig implements Animal{
	public void animalSound() {
		System.out.println("wee weee");
	}
	public void run() {
		System.out.println("this is runn.....");
	}
}
class Main{
	public static void main(String[] args) {
		Pig interfaceObj = new Pig();
		interfaceObj.animalSound();
		interfaceObj.run();
	}
}