import java.util.Iterator;

public class NaturalNumersAddition {
	public int findSumOfNaturalnum(int n) {
		return n * (n + 1) / 2;
	}

	static int retunrbyforloop(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + 1;
		}
		return sum;
	}

	public static void main(String[] args) {
		double now = System.currentTimeMillis();
		NaturalNumersAddition obj = new NaturalNumersAddition();
//		Students obj = new Students();
//		System.out.println("age is: " + obj.age);
//		System.out.println("name is: " + obj.first_nam);
//		System.out.println("graduaiton year is: " + obj.graduationYeaar);
//		obj.absFunction();
		System.out.println(obj.retunrbyforloop(10));
		System.out.println("time taken "+ (System.currentTimeMillis() - now) + " Millisec");
	}
}
