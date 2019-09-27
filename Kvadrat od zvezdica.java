package cetvrtidomaci;

import java.util.Scanner;

public class CeTvRtIZ {

	public static void main(String[] args) {
		int s, i, j;
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite stranicu kvadrata: ");
		s = sc.nextInt();

		for (i = 1; i <= s; i++) {
			for (j = 1; j <= s; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
