package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 10/12/24
 */

/*

n = 5
 *	*	*	*	*
 *	*	*	*
 *	*	*
 *	*
 *

 */

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n - i - 1; j++) {
				System.out.print("*\t");
			}

			System.out.println();
		}
	}
}
