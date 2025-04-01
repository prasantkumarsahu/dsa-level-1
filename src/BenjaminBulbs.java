import java.util.Scanner;

/**
 * Author: PRASANT
 * Date: 10/12/24
 */

public class BenjaminBulbs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i * i <= n; i++) {
			System.out.println(i * i);
		}
	}
}
