package BaekJoon;

import java.util.Scanner;

public class A1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		char saveChar;
		for (int i = 0; i <= a; i++) {
			boolean flag = true;
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				for (int k = j + 1; k < s.length(); k++) {
					if (k == j + 1) {
						if (c == s.charAt(k)) {
							j++;
						}
					} else {
						if (c == s.charAt(k)) {
							flag = false;
							break;
						}
					}
				}
				if (!flag) {
					break;
				}
				if (j == s.length() - 1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}