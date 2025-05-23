package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 12/02/25
 */

/*

n = 5
*	*	*		*
		*		*
*	*	*	*	*
*		*
*		*	*	*

 */

public class Pattern19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == n/2+1
						|| j == n/2+1
						|| (i == 1 && j < n/2+1)
						|| (j == n && i < n/2+1)
						|| (i == n && j > n/2)
						|| (j == 1 && i > n/2)) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}

			System.out.println();
		}
	}
}
