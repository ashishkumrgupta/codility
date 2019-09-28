package com.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	public static void main(String[] args) {
		int[] A = { 1, 3, 6, 4, 1, 2 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0)
				set.add(A[i]);
		}

		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return 1;
	}
}
