package com.revature.sort;

public class BubbleSort {

	public static void sort(int[] arr) {
		int i, j, temp = 0;
		/*
		 * 
		 */
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			// TODO Auto-generated method stub
		}
		
	}
	

}