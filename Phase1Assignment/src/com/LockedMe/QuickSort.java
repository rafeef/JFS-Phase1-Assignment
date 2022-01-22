package com.LockedMe;

import java.io.File;


public class QuickSort {

	
	public static void quickSort (File a[], int start , int end)
	{
		if (start < end)
		{
			int pivotIndex = partition(a, start , end);
			quickSort(a, start, pivotIndex-1);
			quickSort(a, pivotIndex+1, end);
		}
		
	}
	
	
	public static int partition(File a[],int start, int end)
	{
		File pivot = a[end];
		int pi = start;
		
		for (int i = start; i <= end ; i++)
		{
			if (a[i].getName().compareToIgnoreCase(pivot.getName())  <= 0)
			{
				swap(a,i,pi);
				pi++;
			}
		}
		
		return pi-1;
	}
	
	public static void swap (File a[], int f, int s)
	{
		File temp = a[f];
		a[f] = a[s];
		a[s] = temp;
	}
	
	


}
