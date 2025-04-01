package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 10/12/24
 */

/*

n = 5
*	*	*		*	*	*
*	*				*	*
*						*
*	*				*	*
*	*	*		*	*	*

 */

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sp = 1;
		int st = n / 2 + 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}

			System.out.println();

			if (i <= n / 2) {
				sp+=2;
				st--;
			} else {
				sp-=2;
				st++;
			}
		}
	}
}
