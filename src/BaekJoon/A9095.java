package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int index = 0; index < testCase; index++) {
			int totalCount = 0;
			int findNumber = Integer.parseInt(br.readLine());
			int[][] number = new int[findNumber][findNumber * 2 + 1];
			int[][] count = new int[findNumber][findNumber * 2 + 1];
			for (int x = 0; x < 3; x++) {
				count[0][x] = 1;
			}
			if (findNumber <= 3) {
				totalCount++;
			}
			for (int indexX = 1; indexX < findNumber; indexX++) {
				for (int indexY = 0; indexY < (indexX + 1) * 2 + 1; indexY++) {
					number[indexX][indexY] = indexX + indexY + 1;
					if (indexY == 0) {
						count[indexX][indexY] += count[indexX - 1][indexY];
					} else if (indexY == 1) {
						count[indexX][indexY] += count[indexX - 1][indexY]
							+ count[indexX - 1][indexY - 1];
					} else {
						count[indexX][indexY] += count[indexX - 1][indexY]
							+ count[indexX - 1][indexY - 1]
							+ count[indexX - 1][indexY - 2];
					}
					if (indexX + indexY + 1 == findNumber) {
						totalCount += count[indexX][indexY];
						break;
					}
				}
			}
			System.out.println(totalCount);
		}

	}
}
