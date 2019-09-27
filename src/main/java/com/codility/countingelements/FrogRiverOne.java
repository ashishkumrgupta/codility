package com.codility.countingelements;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {

	public static void main(String[] args) {
		int[] input = { 1, 3, 1, 4, 2, 3, 5, 4 };
		int X = 5;
		System.out.println("vale:" + solution(X, input));
	}

	public static int solution(int X, int[] A) {
		int flag = X;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < A.length; i++) {
			if ((A[i] <= X) && !map.containsKey(A[i])) {
				map.put(A[i], i);
				flag--;
			}
		}
		if (!map.containsKey(X) || flag != 0)
			return -1;
		else
			return Collections.max(map.values());
	}
}
