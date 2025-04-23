import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 03/04/25
 */

public class AnyBaseMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int base = sc.nextInt();
		sc.close();

		int res = 0;
		int pow = 1;

		while (num2 > 0) {
			int rem2 = num2 % 10;

			int mul = getProductWithASingleDigit(base, num1, rem2);
			res = getSum(base, res, mul * pow);

			num2 /= 10;
			pow *= 10;
		}

		System.out.println(res);
	}

	public static int getProductWithASingleDigit(int base, int num1, int rem2) {
		int res = 0;
		int car = 0;
		int pow = 1;

		while (num1 > 0 || car > 0) {
			int rem1 = num1 % 10;

			int mul = rem1 * rem2 + car;
			car = mul / base;
			mul = mul % base;

			res += mul * pow;

			num1 /= 10;
			pow *= 10;
		}

		return res;
	}

	public static int getSum(int base, int num1, int num2) {
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

		return res;
	}
}
