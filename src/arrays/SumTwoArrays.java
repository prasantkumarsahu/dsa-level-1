package arrays;

import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 07/04/25
 */

public class SumTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}

		int[] res = new int[Math.max(n1, n2)];
		int i = 0;
		int j = 0;
		int k = 0;
		int car = 0;

		while (i < n1 && j < n2) {
			int sum = arr1[i] + arr2[j] + car;
			res[k] = sum % 10;
			car = sum / 10;
			i++;
			j++;
			k++;
		}

		while (i < n1) {
			int sum = arr1[i] + car;
			res[k] = sum % 10;
			car = sum / 10;
			i++;
			k++;
		}

		while (j < n2) {
			int sum = arr2[j] + car;
			res[k] = sum % 10;
			car = sum / 10;
			j++;
			k++;
		}

		if (car > 0) {
			System.out.print(car);
		}

		for (int n : res) {
			System.out.print(n);
		}
	}
}
