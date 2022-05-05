package com.careerit.junit.basics;
public class ArraysPrograms {

	// Find max element of given array
	public int maxElement(int[] arr) {
		int max = arr[0];
		for (int ele : arr) {
			if (max < ele) {
				max = ele;
			}
		}
		return max;
	}

	// Find sum of all the elements
	public long sumOfElement(int[] arr) {
		return -1;
	}

	// If key is present in the array it should return true otherwise false
	public boolean search(int[] arr, int key) {
		return false;
	}

	// Sort array elements in given direction ( asc, desc )
	public int[] sort(int[] arr, String order) {
		return null;
	}

	// Generated prime store in array and return
	public int[] generateNPrimeNumbers(int n) {

		return null;
	}

	// Check subArr is subset of masterArr
	public boolean isSubSet(int[] masterArr, int[] subArr) {
		if(masterArr.length < subArr.length)
			return false;
	
		
		return false;
	}

	// Return max sum row in the 2d array
	public int[] maxSumRow(int[][] arr) {

		return null;
	}

}