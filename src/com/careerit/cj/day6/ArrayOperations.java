package com.careerit.cj.day6;

import java.util.Arrays;

class ArrayAssignment {

	public int maxElement(int[] arr) {
		int max = arr[0];
		for (int i = 1; i <= arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public int minElement(int[] arr) {
		return 0;
	}

	// If element present it should return index value otherwise -1
	public int indexOf(int[] arr, int ele) {
		// Logic
		return -1;
	}

}

public class ArrayOperations {

	public static void main(String[] args) {

		ArrayAssignment obj = new ArrayAssignment();
		int max = obj.maxElement(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 18, 15, 12 });

		int a = 10, b = 20;
		System.out.println("A = " + a + " B = " + b);
		swap(a, b);
		System.out.println("A = " + a + " B = " + b);

		int arr[] = { 1, 2, 3, 4, 5 };
		int brr[] = { 4, 5, 6 };
		System.out.println("Aarr = " + Arrays.toString(arr) + " B = " + Arrays.toString(brr));
		swap(arr, brr);
		System.out.println("Aarr = " + Arrays.toString(arr) + " B = " + Arrays.toString(brr));

	}

	public static void swap(int[] arr, int brr[]) {
		int t[] = arr;
		brr = arr;
		arr = t;

	}

	public static void swap(int a, int b) {
		int t = a;
		b = a;
		a = t;

	}

}
