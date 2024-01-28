package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A4963 {
	private static int count;
	private static boolean[][] visit;
	static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] map;
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			if (x == 0 && y == 0) {
				break;
			}
			map = new int[x][y];
			visit = new boolean[x][y];
			for (int i = 0; i < x; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < y; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			count = 0;
			findIsland(map);
			System.out.println(count);
		}
	}

	private static void findIsland(int[][] map) {
		List<Integer> coordinateList = new ArrayList<>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == 1 && !visit[i][j]) {
					coordinateList.add(i);
					coordinateList.add(j);
					while (!coordinateList.isEmpty()) {
						int x = coordinateList.remove(0);
						int y = coordinateList.remove(0);
						if (!visit[x][y]) {
							visit[x][y] = true;
							checkLand(map, x, y, coordinateList);
						}
					}
					count++;
				}
			}
		}
	}

	private static void checkLand(int[][] map, int x, int y, List<Integer> coordinateList) {
		for (int i = 0; i < 8; i++) {
			if ((x + dx[i] >= 0 && x + dx[i] < map.length) && (y + dy[i] >= 0 && y + dy[i] < map[0].length)
				&& map[x + dx[i]][y + dy[i]] == 1 && !visit[x + dx[i]][y + dy[i]]) {
				coordinateList.add(x + dx[i]);
				coordinateList.add(y + dy[i]);
			}
		}
	}
}
