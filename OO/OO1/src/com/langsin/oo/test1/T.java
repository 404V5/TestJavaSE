package com.langsin.oo.test1;
public class T {
	public static void main(String args[]) {
		for (int i = 1; i <= 5; i += 2) {
			for (int k = 5; k > i - 1; k--) {
				System.out.print(" ");
			}
			for (int x = 1; x <= i; x++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int j = 1; j <= 3; j += 2) {
			for (int k1 = 1; k1 < j + 3; k1++) {
				System.out.print(" ");
			}
			for (int x1 = 3; x1 >= j; x1--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}