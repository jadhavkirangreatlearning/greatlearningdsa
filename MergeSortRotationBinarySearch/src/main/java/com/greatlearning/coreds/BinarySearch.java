package com.greatlearning.coreds;

import java.util.Scanner;

public class BinarySearch {

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
	 * rotation.leftRotate(arr, midElement, arr.length);
	 * 
	 * System.out.println("\n After Rotation: ");
	 * 
	 * for (int i = 0; i < size; i++) { System.out.print(arr[i] + " "); }
	 * 
	 * System.out.println("\n Please enter key: ");
	 * 
	 * int key = scanner.nextInt();
	 * 
	 * BinarySearch binarySearch = new BinarySearch();
	 * 
	 * int index = binarySearch.pivotedBinarySearch(arr, arr.length, key);
	 * 
	 * System.out.println("\n Key Location: " + (index + 1)); }
	 */

	int pivotedBinarySearch(int arr[], int n, int key) {
		int pivote = findPivoteElement(arr, 0, n - 1);

		if (pivote == -1) {
			return binarySearchImplementation(arr, 0, n - 1, key);
		} else if (arr[pivote] == key) {
			return pivote;
		} else if (arr[0] <= key) {
			return binarySearchImplementation(arr, 0, pivote - 1, key);
		} else {
			return binarySearchImplementation(arr, pivote + 1, n - 1, key);
		}

	}

	int findPivoteElement(int arr[], int low, int high) {

		if (high < low) {
			return -1;
		} else if (high == low) {
			return low;
		}

		int mid = (low + high) / 2;

		if (mid < high && arr[mid] > arr[mid + 1]) {
			return mid;
		} else if (mid > low && arr[mid] < arr[mid - 1]) {
			return (mid - 1);
		} else if (arr[low] >= arr[mid]) {
			return findPivoteElement(arr, low, mid - 1);
		} else {
			return findPivoteElement(arr, mid + 1, high);
		}

	}

	int binarySearchImplementation(int arr[], int low, int high, int key) {
		if (high < low) {
			return -1;
		}

		int mid = (low + high) / 2;

		if (key == arr[mid]) {
			return mid;
		} else if (key > arr[mid]) {
			return binarySearchImplementation(arr, (mid + 1), high, key);
		} else {
			return binarySearchImplementation(arr, low, (mid - 1), key);
		}

	}

}
