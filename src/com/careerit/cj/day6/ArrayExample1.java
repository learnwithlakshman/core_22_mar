package com.careerit.cj.day6;

import java.util.Arrays;

public class ArrayExample1 {

		public static void main(String[] args) {
			
					int[] arr1 = new int[5];
					
					int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10,1,2,3,4,54,5,6,78,90,99};
					
					int[] arr3 = {1,2,3,4,5};
					
					System.out.println(Arrays.toString(arr1));
					System.out.println(Arrays.toString(arr2));
					System.out.println(Arrays.toString(arr3));
					
					System.out.println(arr1.length);
					System.out.println(arr2.length);
					
					// Get last three element from arr2
					
					for(int i=arr2.length-3;i<arr2.length;i++) {
						System.out.println(arr2[i]);
					}
					
					for(int i = arr3.length;i>=0;i--) {
						System.out.println(arr3[i]);
					}
					
					
					
		}
}
