package com.greatlearning.coreds;

import java.util.Scanner;

public class Rotation {

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("\n Please enter size of array: ");
	 * 
	 * Scanner scanner = new Scanner(System.in);
	 * 
	 * int size = scanner.nextInt();
	 * 
	 * System.out.println("\n Please enter elements: ");
	 * 
	 * int arr[] = new int[size];
	 * 
	 * for (int i = 0; i < size; i++) { arr[i] = scanner.nextInt(); }
	 * 
	 * MergeSort mergeSort = new MergeSort();
	 * 
	 * mergeSort.sort(arr, 0, arr.length - 1);
	 * 
	 * System.out.println("\n After Sort: ");
	 * 
	 * for (int i = 0; i < size; i++) { System.out.print(arr[i] + " "); }
	 * 
	 * int midElement = arr[arr.length / 2];
	 * 
	 * Rotation rotation = new Rotation();
	 * 
	 * 
	 * rotation.leftRotate(arr, midElement, arr.length);
	 * 
	 * System.out.println("\n After Rotation: ");
	 * 
	 * for(int i=0;i<size;i++) { System.out.print(arr[i]+ " "); } }
	 */
	void leftRotate(int arr[], int elem, int size) {
		for (int i = 0; i < elem; i++) {
			leftRotateByOne(arr, size);
		}
	}

	void leftRotateByOne(int arr[], int size) {
		int i, temp;

		temp = arr[0];

		for (i = 0; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[size - 1] = temp;

	}

}
