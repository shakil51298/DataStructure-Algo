package interFace;


// interface classes
interface Animal{
	int num = 0;
	void animalSound();
}

class Pig implements Animal{
	int num = 555;
	public void animalSound() {
		System.out.println("interface method: "+"wee wee weee");
	}
}

// abstract class
abstract class Carsound{
	int num = 0;
	public abstract void volvo();
}
class Volvo extends Carsound{
	int num = 100;
	public void volvo() {
		System.out.println("abstract method "+"vo vo vo vo");
	}
} 


class Main{
	public static void main(String[] args) {
//		obj of interface
		Pig pigObj = new Pig();
		pigObj.animalSound();
//		abstract boj access;
		Volvo volvo = new Volvo();
		volvo.volvo();
		System.out.println("interface attributes: "+pigObj.num);
		System.out.println("interface attributes: "+pigObj.num);
	}
}