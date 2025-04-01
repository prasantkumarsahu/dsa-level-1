import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 12/02/25
 */

public class AnyBaseToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int base = sc.nextInt();

		int res = 0;
		int pow = 1;

		while (num > 0) {
			int rem = num % 10;

			res += rem * pow;

			pow *= base;
			num /= 10;
		}

		System.out.println(res);
	}
}
