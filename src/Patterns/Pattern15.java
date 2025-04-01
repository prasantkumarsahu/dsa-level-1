package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 11/02/25
 */

/*

n = 5
		1
	2	3	2
3	4	5	4	3
	2	3	2
		1

 */

public class Pattern15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int np = n / 2; // no of spaces
		int nt = 1; // no of stars

		int row = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= np; j++) {
				System.out.print("\t");
			}

			int col = row;
			for (int j = 1; j <= nt; j++) {
				System.out.print(col + "\t");

				if (j <= nt / 2) {
					col++;
				} else {
					col--;
				}
			}

			if (i <= n / 2) {
				np--;
				nt += 2;
				row++;
			} else {
				np++;
				nt -= 2;
				row--;
			}

			System.out.println();
		}
	}
}
