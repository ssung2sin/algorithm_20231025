package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1018_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		char[][] dot = new char[x][y];
		for (int indexX = 0; indexX < x; indexX++) {
			st = new StringTokenizer(bf.readLine());
			String color = st.nextToken();
			for (int indexY = 0; indexY < y; indexY++) {
				if (color.charAt(indexY) == 'B') {
					dot[indexX][indexY] = 'B';
				} else {
					dot[indexX][indexY] = 'W';
				}
			}
		}
		System.out.println(countChangeColor(dot, x, y));
	}

	private static int countChangeColor(char[][] dot, int x, int y) {
		int[][] changeCount = new int[x][y];
		if (dot[0][0] == 'B') {
			for (int indexX = 0; indexX < x; indexX++) {
				for (int indexY = 0; indexY < y; indexY++) {
					changeCount[indexX][indexY] = isChangeColor('B', dot[indexX][indexY], indexX + indexY);
				}
			}
		}
		if (dot[0][0] == 'W') {
			for (int indexX = 0; indexX < x; indexX++) {
				for (int indexY = 0; indexY < y; indexY++) {
					changeCount[indexX][indexY] = isChangeColor('W', dot[indexX][indexY], indexX + indexY);
				}
			}
		}
		return countMin(changeCount, x, y);
	}

	private static int isChangeColor(char standardColor, char color, int index) {
		if (index % 2 == 0) {
			if (standardColor != color) {
				return 1;
			}
		} else {
			if (standardColor == color) {
				return 1;
			}
		}
		return 0;
	}

	private static int countMin(int[][] changeCount, int x, int y) {
		int min = x * y;
		for (int i = 0; i <= x - 8; i++) {
			for (int j = 0; j <= y - 8; j++) {
				int newMin = 0;
				for (int k = i; k < i + 8; k++) {
					for (int l = j; l < j + 8; l++) {
						newMin += changeCount[k][l];
					}
				}
				if (newMin > 64 - newMin) {
					if (min > 64 - newMin) {
						min = 64 - newMin;
					}
				} else {
					if (min > newMin) {
						min = newMin;
					}
				}
			}

		}
		return min;
	}
}
