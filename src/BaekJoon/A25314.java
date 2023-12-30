package BaekJoon;

import java.util.Scanner;

public class A25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int divNum = n / 4;
		for (int i = 0; i < divNum; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}
}
