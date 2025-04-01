package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 11/02/25
 */

/*

n = 5
1								1
1	2						2	1
1	2	3				3	2	1
1	2	3	4		4	3	2	1
1	2	3	4	5	4	3	2	1

 */

public class Pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sp = 2 * n - 3;
		int st = 1;

		for (int i = 1; i <= n; i++) {
			int col = 1;
			for (int j = 1; j <= st; j++) {
				System.out.print(col + "\t");
				col++;
			}

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			if (i == n) {
				st--;
				col--;
			}

			for (int j = 1; j <= st; j++) {
				col--;
				System.out.print(col + "\t");
			}

			st++;
			sp -= 2;

			System.out.println();
		}
	}
}
