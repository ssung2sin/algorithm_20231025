package BaekJoon;

import java.util.Scanner;

public class A14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dot = new int[2];
		int result = 0;
		for (int i = 0; i < 2; i++) {
			dot[i] = sc.nextInt();
		}
		if (dot[0] > 0) {
			if (dot[1] > 0) {
				result = 1;
			} else if (dot[1] < 0) {
				result = 4;
			}
		} else if (dot[0] < 0) {
			if (dot[1] < 0) {
				result = 3;
			} else if (dot[1] > 0) {
				result = 2;
			}
		}
		System.out.println(result);
	}
}
