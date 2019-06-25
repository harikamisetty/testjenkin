package com.hari.test;
/*Binary Search: Search a sorted array by repeatedly dividing the search interval in half. 
 * Begin with an interval covering the whole array. If the value of the search key is less than the 
 * item in the middle of the interval, narrow the interval to the lower half. Otherwise narrow it to the upper half. 
 * Repeatedly check until the value is found or the interval is empty.*/

public class BinarySearch {

	public static void main(String args[]) {
		int arr[] = new int[] { 1, 5, 8, 9, 10, 17, 19, 20 };
		int size = arr.length, number =80;
		
		System.out.println("Maximum Obtainable Value is " + search(arr, size, number));
	}

	private static int search(int[] arr, int size, int number) {
		
		int mid = size /2;
		
		if(number == arr[mid]) return arr[mid];
		if(number > arr[mid]){
			for(int i=mid; i<size ; i++){
				if(arr[i] == number)
					return arr[i];
			}
		}
		
		if(number < arr[mid]){
			for(int i=0; i<mid ; i++){
				if(arr[i] == number)
					return arr[i];
			}
		}
		
		return -1;
	}
}
