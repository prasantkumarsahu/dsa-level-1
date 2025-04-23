package arrays;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 07/04/25
 */

public class FindElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int[] arr = new int[t];
		for (int i = 0; i < t; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		int res = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				res = i;
				break;
			}
		}

		System.out.println(res);
	}
}
