import java.util.Arrays;

public class BinarySearchImplementation {
//	Binary Search Example in Java using Recursion
	private static int binarySearchRecursion(int arr[], int firstIndex, int lastIndex, int findingNumber) {
		if (lastIndex >= firstIndex) {
			int mid = (firstIndex + lastIndex) / 2;
			if (arr[mid] == findingNumber) {
				return mid;
			}
			if (arr[mid] > findingNumber) {
				return binarySearchRecursion(arr, firstIndex, mid - 1, findingNumber);
			} else {
				return binarySearchRecursion(arr, mid + 1, lastIndex, findingNumber);
			}
		}
		return -1;
	}

//	Binary Search Example in Java	
	private static void binarySearch(int arr[], int firstIndex, int lastIndex, int findingNumber) {

		while (firstIndex <= lastIndex) {
			int midIndex = (firstIndex + lastIndex) / 2;

			if (arr[midIndex] < findingNumber) {
				firstIndex = midIndex + 1;
			} else if (arr[midIndex] == findingNumber) {
				System.out.println("we found the index of expecting number: " + midIndex);
				break;
			} else {
				lastIndex = midIndex - 1;
			}
//			midIndex = (firstIndex + lastIndex) / 2 ;
		}

		if (firstIndex > lastIndex) {
			System.out.println("Not found!!");
		}
	}

	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 30, 40, 50 };
		int firstIndex = 0;
		int lastIndex = arr.length - 1;
		int findingNumber = 30;
		
//		Binary Search Example in Java using Arrays.binarySearch()
		int getBinaySearchUsingDefault_binarySearch = Arrays.binarySearch(arr, findingNumber);
		if (getBinaySearchUsingDefault_binarySearch < firstIndex) {
			System.out.println("Not found");
		} else {
			System.out.println("FOUND ; this result is coming from default binarySearch method :"
					+ getBinaySearchUsingDefault_binarySearch);
		}
		binarySearch(arr, firstIndex, lastIndex, findingNumber);
		
//		Recursion
		int RecursionResult = binarySearchRecursion(arr , firstIndex, lastIndex, findingNumber) ;
		if(RecursionResult == -1) {
			System.out.println("No found");
		}
		else {
			System.out.println("Element is found at index: " + RecursionResult);
		}
	}

}
