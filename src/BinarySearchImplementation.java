
public class BinarySearchImplementation {
	private static void binarySearch(int arr[],int firstIndex, int lastIndex, int findingNumber) {
		int midIndex = (firstIndex + lastIndex) / 2 ;
		while(firstIndex <= lastIndex) {
			if(arr[midIndex] < findingNumber) {
				firstIndex = midIndex + 1;
			}
			else if(arr[midIndex] == findingNumber) {
				System.out.println("we found the index of expecting number: " + midIndex);
				break ;
			}
			else {
				lastIndex = midIndex - 1 ;
			}
			midIndex = (firstIndex + lastIndex) / 2 ;
		}
		
		if(firstIndex > lastIndex) {
			System.out.println("Not found!!");
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50} ;
		int firstIndex = 0 ; 
		int lastIndex = arr.length - 1 ;
		int findingNumber = 30 ;
		binarySearch(arr, firstIndex, lastIndex, findingNumber);
		System.out.println("hello ");
	}

}
