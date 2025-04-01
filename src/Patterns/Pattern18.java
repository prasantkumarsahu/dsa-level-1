package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 11/02/25
 */

/*

n = 5
*	*	*	*	*
	*		*
		*
	*	*	*
*	*	*	*	*

 */

public class Pattern18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int st = n;
		int sp = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {
				if (j > 1 && j < st && i <= n/2 && i > 1) {
					System.out.print("\t");
				} else {
					System.out.print("*\t");
				}
			}

			if (i <= n/2) {
				st-=2;
				sp++;
			} else {
				st+=2;
				sp--;
			}

			System.out.println();
		}
	}
}
