package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int repeat = Integer.parseInt(st.nextToken());
		int[][] count = new int[100][100];
		for (int index = 0; index < repeat; index++) {
			st = new StringTokenizer(bf.readLine());
			int row = Integer.parseInt(st.nextToken());
			int column = Integer.parseInt(st.nextToken());
			inputPaper(count, row, column);
		}
		int tot = 0;
		for (int row = 0; row < 100; row++) {
			for (int column = 0; column < 100; column++) {
				tot += count[row][column];
			}
		}
		System.out.println(tot);
	}

	private static void inputPaper(int[][] count, int row, int column) {
		for (int indexRow = row; indexRow < row + 10; indexRow++) {
			for (int indexColumn = column; indexColumn < column + 10; indexColumn++) {
				if (count[indexRow][indexColumn] < 1) {
					count[indexRow][indexColumn]++;
				}
			}
		}
	}
}
