package com.revature.sort;

public class MergeSort {
	
	public static void sort(int[] arr) {
		// Check if the lenght of the array is less than 2 in order to keep the sorting
	    if(arr.length < 2) {
	      return ;
	    }
	    int arraySize = arr.length;
	    // Find the middle of the array
	    int middle = arraySize / 2;
	    
	    
	    // Create new Arrays one for left and right
	    int[] leftArray = new int[middle];
	    int[] rightArray = new int[arraySize - middle];
	    
	    //Populate each array
	    for(int i = 0; i < middle; i++) {
	      leftArray[i] = arr[i];
	    }
	    for(int j = middle ; j < arraySize; j++ ){
	      rightArray[j - middle] = arr[j];
	    }
	    
	    // Recursively sorting arrays
	    sort(leftArray);
	    sort(rightArray);
	    
	    // Merge and sort last two arrays into one
	    merge(arr, leftArray, rightArray, middle, arraySize - middle);
				
			// TODO Auto-generated method stub
		}
		
	
		// TODO Auto-generated method stub
	
	
	private static void merge(int[] arr, int[] left, int[] right, int leftSize, int rightSize) {
	    // Creating basis iterators for the arrays
	    int j = 0, i = 0, k = 0;
	    // int leftSize = left.length;
	    // int rightSize = right.length;
	    
	    while(i < leftSize && j < rightSize){
	      	if(left[i] <= right[j]) {
	          	arr[k++] = left[i++];
	        } else {
	            arr[k++] = right[j++];
	        }
	    }
	    while(i < leftSize){
	      arr[k++] = left[i++];
	    }
	    while(j < rightSize) {
	      arr[k++] = right[j++];
	    }
	}
	
}