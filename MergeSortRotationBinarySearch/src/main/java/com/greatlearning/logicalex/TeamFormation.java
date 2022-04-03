package com.greatlearning.logicalex;

class TeamFormation {

	// Function to find if T number of teams can be formed or not
	public static boolean checkTeamFormationPossible(int[] teams, int T, int k) {

		// Store sum of array elements
		int sum = 0;

		// Traverse the array
		for (int i = 0; i < teams.length; i++) {
			sum += Math.min(T, teams[i]);
		}

		// Required Condition
		return (sum >= (T * k));
	}

	// Function to find the maximum number of teams possible
	public static int countOfTeams(int[] teams_list, int N, int K) {

		int lowerBound = 0;
		int upperBound = 1000;

		// perform Binary Search
		while (lowerBound <= upperBound) {

			int mid = lowerBound + (int) (upperBound - lowerBound) / 2;

			if (checkTeamFormationPossible(teams_list, mid, K)) {

				if (!checkTeamFormationPossible(teams_list, mid + 1, K)) {
					return mid;
				}

				else {
					lowerBound = mid + 1;
				}
			}

			else {
				upperBound = mid - 1;
			}
		}
		return 0;
	}

	// Driver Code
	public static void main(String args[]) {
		int[] arr = { 4, 3, 5, 3 };
		int K = 3;
		int N = arr.length;
		System.out.println(countOfTeams(arr, N, K));

	}
}
