package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int testCase = Integer.parseInt(br.readLine());
		int[][] coordinate = new int[testCase][2];
		for (int index = 0; index < testCase; index++) {
			st = new StringTokenizer(br.readLine());
			coordinate[index][0] = Integer.parseInt(st.nextToken());
			coordinate[index][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(coordinate, (e1, e2) -> {
			if (e1[1] != e2[1]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});

		for (int index = 0; index < testCase; index++) {
			System.out.println(coordinate[index][0] + " " + coordinate[index][1]);
		}
	}
}
