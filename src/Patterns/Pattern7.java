package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 10/12/24
 */

/*

n = 5
*
	*
		*
			*
				*

 */

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == j) {
					System.out.print("*");
				} else {
					System.out.print("\t");
				}
			}

			System.out.println();
		}
	}
}
