package com.greatlearning.coreds;

import java.util.Arrays;

public class OptimzeSolutionForSort {
	public static void main(String[] args) {

		int arr[]= {3, 4, 2, 1, 9, 8, 7};
		
		
		System.out.println("\n Before Sort: ");
		for(int i: arr) {
			System.out.println(i);
		}
		
		System.out.println("\n After Sort: ");
		
		Arrays.parallelSort(arr);
		
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
