package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int workDay = Integer.parseInt(br.readLine());

		int[][] consulting = new int[2][workDay];
		int[] totalPay = new int[workDay + 1];

		for (int index = 0; index < workDay; index++) {
			st = new StringTokenizer(br.readLine());
			consulting[0][index] = Integer.parseInt(st.nextToken());
			consulting[1][index] = Integer.parseInt(st.nextToken());
			totalPay[index] = consulting[1][index];
		}

		findTotalPay(consulting, totalPay);

		System.out.println(totalPay[workDay]);
	}

	private static void findTotalPay(int[][] consulting, int[] totalPay) {
		for (int i = 0; i < consulting[0].length; i++) {
			int day = consulting[0][i];
			for (int j = i + day; j < totalPay.length; j++) {
				if (j == consulting[0].length) {
					if (totalPay[j] < totalPay[i]) {
						totalPay[j] = totalPay[i];
					}
					break;
				}
				if (totalPay[j] < totalPay[i] + consulting[1][j]) {
					totalPay[j] = totalPay[i] + consulting[1][j];
				}
			}
		}
	}
}
