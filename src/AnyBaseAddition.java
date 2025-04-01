import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 12/02/25
 */

public class AnyBaseAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int base = sc.nextInt();

		int res = 0;
		int car = 0;
		while (num1 > 0 && num2 > 0) {
			int rem1 = num1 % base;
			int rem2 = num2 % base;

			int rem = rem1 + rem2;
			if (rem > base) {
				rem = rem % base;
				car++;
			}

			if (car > 0) {
				rem += car;
				car--;
			}

			num1 /= base;
			num2 /= base;
		}

		while (num1 > 0) {
			int rem1 = num1 % base;

			if (car > 0) {

			}
		}
	}
}
