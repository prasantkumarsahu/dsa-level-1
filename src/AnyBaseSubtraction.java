import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 02/04/25
 */

public class AnyBaseSubtraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int base = sc.nextInt();
		sc.close();

		int res = 0;
		int bor = 0;
		int pow = 1;

		while (num1 > 0 || num2 > 0 || bor > 0) {
			int rem1 = num1 % 10;
			int rem2 = num2 % 10;

			rem2 -= bor;

			int digit;
			if (rem2 >= rem1) {
				digit = rem2 - rem1;
				bor = 0;
			} else {
				digit = (rem2 + base) - rem1;
				bor = 1;
			}

			res += digit * pow;
			pow *= 10;

			num1 /= 10;
			num2 /= 10;
		}

		System.out.println(res);
	}
}
