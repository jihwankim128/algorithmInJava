package com.study.algorithm.boj2747;

import java.io.*;

public class Main {

	static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	static int DP[] = new int[46];

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(BR.readLine());
		DP[1] = 1;
		System.out.println(fibo(n));
	}

	private static int fibo(int n) {
		if (n <= 1) return DP[n];
		if (DP[n] == 0) {
			DP[n] = fibo(n-2) + fibo(n-1);
		}
		return DP[n];
	}

}
