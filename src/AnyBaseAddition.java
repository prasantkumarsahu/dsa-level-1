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
		sc.close();

		int res = 0;
		int car = 0;
		int pow = 1;

		while (num1 > 0 || num2 > 0 || car > 0) {
			int rem1 = num1 % 10;
			int rem2 = num2 % 10;

			int sum = rem1 + rem2 + car;
			int digit = sum % base;
			car = sum / base;

			res += digit * pow;
			pow *= 10;

			num1 /= 10;
			num2 /= 10;
		}

		System.out.println(res);
	}
}
