package com.greatlearning.coreds;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {

		System.out.println("\n Please enter size of array: ");

		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();

		System.out.println("\n Please enter elements: ");

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		MergeSort mergeSort = new MergeSort();

		mergeSort.sort(arr, 0, arr.length - 1);

		System.out.println("\n After Sort: ");

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		int midElement = arr[arr.length / 2];

		Rotation rotation = new Rotation();

		rotation.leftRotate(arr, midElement, arr.length);

		System.out.println("\n After Rotation: ");

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n Please enter key: ");

		int key = scanner.nextInt();

		BinarySearch binarySearch = new BinarySearch();

		int index = binarySearch.pivotedBinarySearch(arr, arr.length, key);

		System.out.println("\n Key Location: " + (index + 1));

		scanner.close();
	}
}
