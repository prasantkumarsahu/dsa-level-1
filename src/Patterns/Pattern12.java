package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 11/02/25
 */

/*

n = 5
0
1	1
2	3	5
8	13	21	34
55	89	144	233	377

 */

public class Pattern12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 0;
		int b = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + "\t");
				int c = a + b;
				a = b;
				b = c;
			}

			System.out.println();
		}
	}
}
