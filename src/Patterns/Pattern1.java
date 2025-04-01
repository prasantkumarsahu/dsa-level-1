package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 10/12/24
 */

/*

n = 5
 *
 *	*
 *	*	*
 *	*	*	*
 *	*	*	*	*

 */

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int row = 1; row <= n; row++) { //  n = 5, row = 1, 2, 3, 4, 5, 6  6<=5
			for (int col = 1; col <= row; col++) { // col = 6, col <= row (6<=5)
				System.out.print("*\t");
			}

			System.out.println();
		}
	}
}
