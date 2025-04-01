import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 02/12/24
 */

public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int div = 2; div * div <= n; div++) {
			while (n % div == 0){
				n /= div;
				System.out.println(div);
			}
		}

		if (n != 1){
			System.out.println(n);
		}
	}
}
