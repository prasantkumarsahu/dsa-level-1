package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 11/02/25
 */

/*

n = 5
1
2	3
4	5	6
7	8	9	10
11	12	13	14	15

 */

public class Pattern11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + "\t");
			}

			System.out.println();
		}
	}
}
