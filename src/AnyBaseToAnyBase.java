import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 12/02/25
 */

public class AnyBaseToAnyBase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int cBase = sc.nextInt();
		int dBase = sc.nextInt();

		int res = 0;
		int pow = 1;

		while (num > 0) {
			int rem = num % dBase;

			res += rem * pow;

			pow *= cBase;
			num /= dBase;
		}

		System.out.println(res);
	}
}
