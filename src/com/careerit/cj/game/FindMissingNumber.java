package com.careerit.cj.game;

import java.util.Arrays;

public class FindMissingNumber {

		public static void main(String[] args) {
			
				int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
				int[] arr2 = getPeopleAtB();
				
				// Missing person
				
//				int sum1 = 0;
//				for(int ele:arr1) {
//					sum1 += ele;
//				}
//				
//				int sum2 = 0;
//				for(int ele:arr2) {
//					sum2 += ele;
//				}
//				System.out.println(sum1 - sum2);
				
//				for(int ele:arr1) {
//					if(!search(arr2, ele)) {
//						System.out.println("Missing element is :"+ele);
//						break;
//					}
//				}
				
				for(int i=0;i<arr1.length;i++) {
					
				}
				for(int ele:arr1) {
					
				}
				
				Arrays.sort(arr2);
				
		}
		
		private static boolean search(int[] arr,int key) {
			for(int ele:arr) {
				if(ele == key) {
					return true;
				}
			}
			
			return false;
		}

		private static int[] getPeopleAtB() {
			return new int[]{5,6,7,8,10,1,2,3,4};
		}
}
