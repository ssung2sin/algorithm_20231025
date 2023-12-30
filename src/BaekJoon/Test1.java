package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException {
		//미완

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int j = 0;
		int k = 0;

		String[][] names = new String[n][n];
		String input = bf.readLine();
		for (int i = 0; i < n * n; i++) {

			String[] inputNames = input.split("\\s+");
			if (k >= n) {
				k = 0;
				j++;
			}
			names[j][k] = inputNames[i];
			k++;

		}
		for (int i = 0; i < names.length; i++) {
			for (int l = 0; l < names.length; l++) {
				System.out.printf(names[i][l] + " ");
			}
			System.out.println();
		}

		int w = Integer.parseInt(bf.readLine());
		if (n % 2 == 1) {

		}
		if (n % 2 == 0) {
			int idx = n / 2;
			int count = 0;
			for (int i = idx; i > 0; i--) {
				String[] saveName = new String[idx * 8 - 4];
				boolean xFlag = false;
				int x = count;
				int y = -1 + count;
				int max = n - 1 + count;
				for (int m = 0; m < saveName.length; m++) {
					if (y == count && !xFlag) {
						x--;
					}
					if (x == max) {
						y--;
					}
					if (y == max) {
						xFlag = false;
						x++;
					}
					if (x == count) {
						y++;
						xFlag = true;
					}
					saveName[m] = names[x][y];
				}
				int divW = w % (idx * 8 - 4);
				int index = divW;
				for (int a = 0; a < (idx * 8 - 4); a++) {
					String temp = saveName[index];
					saveName[index] = saveName[a];
					saveName[a] = temp;
					index++;
					if (index == idx * 8 - 4) {
						index = 0;
					}
				}
				x = count;
				y = -1 + count;
				for (int m = 0; m < saveName.length; m++) {
					if (y == count && !xFlag) {
						x--;
					}
					if (x == max) {
						y--;
					}
					if (y == max) {
						xFlag = false;
						x++;
					}
					if (x == count) {
						y++;
						xFlag = true;
					}
					names[x][y] = saveName[m];
				}
				for (i = 0; i < n; i++) {
					for (j = 0; j < n; j++) {
						System.out.printf(names[i][j] + " ");
					}
					System.out.println();
				}
				count++;

			}
		}
	}
}
