import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 12/02/25
 */

public class DecimalToAnyBase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int base = sc.nextInt();

		int ans = 0;
		int p = 1;

		while (num > 0) {
			int rem = num % base;

			ans += rem * p;

			p *= 10;
			num /= base;
		}

		System.out.println(ans);
	}
}
