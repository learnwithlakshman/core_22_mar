package com.careerit.cj.day7;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 5 }, { 2, 3, 4 }, { 3, 4, 3 } };
		
		System.out.println(Arrays.toString(getMaxOfEachRow(arr)));
		System.out.println(Arrays.toString(getMinOfEachRow(arr)));
		System.out.println(Arrays.toString(getMaxOfEachCol(arr)));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int ele[] : arr) {
			for (int e : ele) {
				System.out.print(e + " ");
			}
			System.out.println();
		}

	}

	private static int[] getMaxOfEachRow(int[][] arr) {
		
		int[] maxArr = new int[arr.length];
		int c = 0;
		/*
		 * for (int i = 0; i < arr.length; i++) { int max = arr[i][0]; for (int j = 0; j
		 * < arr[i].length; j++) { if(max < arr[i][j]) { max = arr[i][j]; } }
		 * maxArr[c++]=max; }
		 */
		
		for (int ele[] : arr) {
			int max = ele[0];
			for (int e : ele) {
				if(max < e) {
					max = e;
				}
			}
			maxArr[c++] = max;
		}
		return maxArr;
	}

	private static int[] getMinOfEachRow(int[][] arr) {
		int[] minArr = new int[arr.length];
		int c = 0;
		for (int ele[] : arr) {
			int min = ele[0];
			for (int e : ele) {
				if(min > e) {
					min = e;
				}
			}
			minArr[c++] = min;
		}
		return minArr;
	}

	private static int[] getMaxOfEachCol(int[][] arr) {
		int[] colArr = new int[arr.length];
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if(max < arr[j][i]) {
					max = arr[j][i];
				}
			}
			colArr[c++] = max;
		}
		return colArr;
	}

}
