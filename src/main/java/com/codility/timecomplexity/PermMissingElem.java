package com.codility.timecomplexity;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 5 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		Arrays.sort(A);
		int size = A.length;
		int count = 1;

		for (int i = 0; i < size; i++) {
			if (A[i] != count)
				return count;
			count++;
		}
		return count;
	}
}
