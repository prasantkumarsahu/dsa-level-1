package arrays;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 03/04/25
 */

public class SpanOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int[] a = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int e : a) {
			min = Math.min(min, e);
			max = Math.max(max, e);
		}

		System.out.println(max - min);
	}
}
