import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 01/12/24
 */

public class GCDnLCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int on1 = n1;
		int on2 = n2;

		while(n1 % n2 != 0) {
			int r = n1 % n2;
			n1 = n2;
			n2 = r;
		}

		int gcd = n2;
		int lcm = (on1 * on2) / gcd;

		System.out.println("GCD is : " + gcd);
		System.out.println("LCM is : " + lcm);
	}
}
