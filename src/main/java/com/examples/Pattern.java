package com.examples;

public class Pattern {
	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

//				if ((i % 2 == 0) || (j == 0) || (j == 4)) {
//					System.out.print("*");
//				}

				if (i == 1 || i== (n/2) + 1 || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}