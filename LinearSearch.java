package com.hari.test;
/*The time complexity of above algorithm is O(n).

Linear search is rarely used practically because other search algorithms such as the binary search algorithm 
and hash tables allow significantly faster searching comparison to Linear search.*/

public class LinearSearch {
	
	public static void main(String args[]) {
		int arr[] = new int[] { 1, 5, 8, 9, 10, 17, 17, 20 };
		int size = arr.length, number =20;
		
		System.out.println("Maximum Obtainable Value is " + search(arr, size, number));
	}

	private static int search(int[] arr, int size, int number) {
		
		for(int i=0; i<size; i++){
			if(arr[i] == number){
				return 0;
			}
		}
		return -1;
	}
}
