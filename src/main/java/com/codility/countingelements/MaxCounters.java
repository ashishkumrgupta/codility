package com.codility.countingelements;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		int A[] = { 3, 4, 4, 6, 1, 4, 4 };
		int N = 5;
		System.out.println(Arrays.toString(solution(N, A)));
	}

	public static int[] solution(int N, int[] A) {
		int result[] = new int[N];
		int maxCounterIndex = 0;
		int lastUpdate = 0;

		for (int i = 0; i < A.length; i++) {
			int value = A[i];

			if (1 <= value && value <= N) {
				if (result[value - 1] < lastUpdate) {
					result[value - 1] = lastUpdate + 1;
				} else {
					result[value - 1] = result[value - 1] + 1;
				}
				if (result[maxCounterIndex] < result[value - 1])
					maxCounterIndex = value - 1;
			} else if (value == N + 1) {
				lastUpdate = result[maxCounterIndex];
			}
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] < lastUpdate)
				result[i] = lastUpdate;
		}
		return result;
	}
}
