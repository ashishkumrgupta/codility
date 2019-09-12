package com.codility.timecomplexity;

public class FrogJmp {

	public static void main(String[] args) {
		int X = 10;
		int Y = 85;
		int D = 30;
		System.out.println(solution(X, Y, D));
	}

	public static int solution(int X, int Y, int D) {

		int dev = (Y - X) % D;

		if (X == Y)
			return 0;
		else if (dev == 0)
			return (Y - X) / D;
		else
			return ((Y - X) / D) + 1;
	}
}
