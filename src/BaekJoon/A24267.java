package BaekJoon;

import java.util.Scanner;

public class A24267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long tot = ((long)n * (n - 1) * (n - 2)) / 6;

		System.out.println(tot);
		System.out.println(3);
	}
}
