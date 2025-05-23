import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 01/12/24
 */

public class RotateANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int temp = n;
		int nod = 0;
		while(temp > 0) {
			temp /= 10;
			nod++;
		}

		k = k % nod;
		if (k < 0) {
			k = k + nod;
		}

		int div = 1;
		int mult = 1;
		for (int i = 0; i < nod; i++) {
			if (i < k) div *= 10;
			else mult *= 10;
		}

		int q = n / div;
		int r = n % div;

		int rot = r * mult + q;

		System.out.println(rot);
	}
}
