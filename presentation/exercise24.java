package presentation;

import java.util.List;

public class exercise24 {
	public static int findLargestIndex(int[] arr, int low, int high) {
		if (low == high) {  // only one element left
			return low;
		}

		int mid = low + (high - low) / 2;

		if (arr[mid] < arr[mid + 1]) {  // largest number is in the right half
			return findLargestIndex(arr, mid + 1, high);
		} else {  // largest number is in the left half or is the current number
			return findLargestIndex(arr, low, mid);
		}
	}
	public static void main(String[] args) {
		int[] a = {3,5,7,8,3,2,1};
		System.out.println(findLargestIndex(a,0,7-1));
	}
}
