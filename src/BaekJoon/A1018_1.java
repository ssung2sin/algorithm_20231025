package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1018_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int oddCount = 0;
		int evenCount = 0;
		int[][] changeCount = new int[x][y];
		int[][] dot = new int[x][y];
		for (int indexX = 0; indexX < x; indexX++) {
			st = new StringTokenizer(bf.readLine());
			String color = st.nextToken();
			for (int indexY = 0; indexY < y; indexY++) {
				if (color.charAt(indexY) == 'B') {
					dot[indexX][indexY] = 1;
				} else {
					dot[indexX][indexY] = 0;
				}
				if ((indexX + indexY) % 2 == 0) {
					oddCount += dot[indexX][indexY];
				} else {
					evenCount += dot[indexX][indexY];
				}
			}
		}
		if ((x * y) % 2 == 0) {
			if (oddCount > evenCount) {
				for (int indexX = 0; indexX < x; indexX++) {
					for (int indexY = 0; indexY < y; indexY++) {
						if ((indexX + indexY) % 2 == 0) {
							if (dot[indexX][indexY] == 0) {
								changeCount[indexX][indexY]++;
							}
						} else {
							if (dot[indexX][indexY] == 1) {
								changeCount[indexX][indexY]++;
							}
						}

					}
				}
			} else {
				for (int indexX = 0; indexX < x; indexX++) {
					for (int indexY = 0; indexY < y; indexY++) {
						if ((indexX + indexY) % 2 == 0) {
							if (dot[indexX][indexY] == 1) {
								changeCount[indexX][indexY]++;
							}
						} else {
							if (dot[indexX][indexY] == 0) {
								changeCount[indexX][indexY]++;
							}
						}

					}
				}
			}
		} else {
			if (oddCount - 1 > evenCount) {
				for (int indexX = 0; indexX < x; indexX++) {
					for (int indexY = 0; indexY < y; indexY++) {
						if ((indexX + indexY) % 2 == 0) {
							if (dot[indexX][indexY] == 0) {
								changeCount[indexX][indexY]++;
							}
						} else {
							if (dot[indexX][indexY] == 1) {
								changeCount[indexX][indexY]++;
							}
						}

					}
				}
			} else {
				for (int indexX = 0; indexX < x; indexX++) {
					for (int indexY = 0; indexY < y; indexY++) {
						if ((indexX + indexY) % 2 == 0) {
							if (dot[indexX][indexY] == 1) {
								changeCount[indexX][indexY]++;
							}
						} else {
							if (dot[indexX][indexY] == 0) {
								changeCount[indexX][indexY]++;
							}
						}

					}
				}
			}
		}
		System.out.println(calculationPaint(changeCount, x, y));
	}

	private static int calculationPaint(int[][] changeCount, int x, int y) {
		int min = x * y;
		for (int i = 0; i <= x - 8; i++) {
			for (int j = 0; j <= y - 8; j++) {
				int newMin = 0;
				for (int k = i; k < i + 8; k++) {
					for (int l = j; l < j + 8; l++) {
						newMin += changeCount[k][l];
					}
				}
				if (min > newMin) {
					min = newMin;
				}
			}

		}
		return min;
	}
}
