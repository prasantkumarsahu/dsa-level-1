package Patterns;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 11/02/25
 */

// Number Multiple Table

public class Pattern14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(x + " * " + i + " = " + (x * i));
		}
	}
}
