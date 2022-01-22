package com.LockedMe;

import java.io.File;

public class BinarySearch {
	
	
	public static int recursiveBinarySearch(File arr[], int firstElement, int lastElement, File elementToSearch) {

	    // termination condition
	    if (lastElement >= firstElement) {
	        int mid = firstElement + (lastElement - firstElement) / 2;

	        // if the middle element is our goal element, return its index
	        if (arr[mid].getName().compareToIgnoreCase(elementToSearch.getName()) == 0)
	            return mid;

	        // if the middle element is bigger than the goal element
	        // recursively call the method with narrowed data
	        if (arr[mid].getName().compareToIgnoreCase(elementToSearch.getName()) > 0)	        
	            return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

	        // else, recursively call the method with narrowed data
	        return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
	    }

	    return -1;
	}
	
	
	

}
