import java.util.Arrays;
import java.util.Scanner;

public class LinierSearchImplementation {
	private static int liniear_search(int a[], int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i ;
			}
		}
		int index = 0 ;
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10 , 20 , 0, 50, 010 , 90, 44 , 89} ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value: ");
		int key = scan.nextInt() ;
		System.out.println("the position of 20 is: " + liniear_search(a , key));
	}

}
