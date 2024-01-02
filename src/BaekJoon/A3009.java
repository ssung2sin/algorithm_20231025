package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int x = 0;
		int y = 0;
		int[][] dot = new int[3][3];
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(bf.readLine());
			dot[i][0] = Integer.parseInt(st.nextToken());
			dot[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < 3; i++) {
			int j = 0;
			for (j = 0; j < 3; j++) {
				if (i != j) {
					if (dot[i][0] == dot[j][0]) {
						break;
					}
				}
			}
			if (j == 3) {
				x = dot[i][0];
				break;
			}
		}
		for (int i = 0; i < 3; i++) {
			int j = 0;
			for (j = 0; j < 3; j++) {
				if (i != j) {
					if (dot[i][1] == dot[j][1]) {
						break;
					}
				}
			}
			if (j == 3) {
				y = dot[i][1];
				break;
			}
		}
		System.out.println(x + " " + y);
	}
}
