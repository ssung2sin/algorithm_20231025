package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14215 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int[] side = new int[3];
		for (int i = 0; i < side.length; i++) {
			side[i] = Integer.parseInt(st.nextToken());
		}
		int maxSide = side[0];
		int maxIndex = 0;
		int otherSide = 0;
		for (int i = 1; i < side.length; i++) {
			if (maxSide < side[i]) {
				maxSide = side[i];
				maxIndex = i;
			}
		}
		for (int i = 0; i < side.length; i++) {
			if (i != maxIndex) {
				otherSide += side[i];
			}
		}
		if (maxSide >= otherSide) {
			maxSide = otherSide - 1;
		}

		System.out.println(maxSide + otherSide);
	}
}
