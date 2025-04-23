package arrays;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 07/04/25
 */

public class StarsBarChart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int row = arr[0];
		for (int i = 1; i < n; i++) {
			row = Math.max(row, arr[i]);
		}

		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (arr[j-1] >= i) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}

			System.out.println();
		}
	}
}
