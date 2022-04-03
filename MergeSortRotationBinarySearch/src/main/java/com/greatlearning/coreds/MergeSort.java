package com.greatlearning.coreds;

import java.util.Scanner;

public class MergeSort {

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
	 * }
	 */
	void sort(int arr[], int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;

			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			int n1 = mid - left + 1;
			int n2 = right - mid;

			int leftArray[] = new int[n1];
			int rightArray[] = new int[n2];

			int i, j;

			for (i = 0; i < n1; i++) {
				leftArray[i] = arr[left + i];
			}

			for (j = 0; j < n2; j++) {
				rightArray[j] = arr[mid + 1 + j];
			}

			i = 0;
			j = 0;
			int k = left;
			while (i < n1 && j < n2) {
				if (leftArray[i] <= rightArray[j]) {

					arr[k] = leftArray[i];
					i++;

				} else {
					arr[k] = rightArray[j];
					j++;
				}
				k++;
			}
			while (i < n1) {
				arr[k] = leftArray[i];
				i++;
				k++;
			}

			while (j < n2) {
				arr[k] = rightArray[j];
				j++;
				k++;
			}

		}

	}

}
