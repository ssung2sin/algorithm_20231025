package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A2178_BFS {
	private static int[][] count;
	private static boolean[][] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int column = Integer.parseInt(st.nextToken());
		int[][] maze = new int[row][column];
		count = new int[row][column];
		count[0][0] = 1;

		visit = new boolean[row][column];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			String text = st.nextToken();
			for (int j = 0; j < column; j++) {
				maze[i][j] = text.charAt(j) - 48;
			}
		}
		findExitWithBFS(maze, 0, 0);

		System.out.println(count[row - 1][column - 1]);
	}

	private static void findExitWithBFS(int[][] maze, int row, int column) {
		List<Integer> que = new ArrayList<>();
		que.add(row);
		que.add(column);
		visit[row][column] = true;
		while (!que.isEmpty()) {
			int newRow = que.get(0);
			que.remove(0);
			int newColumn = que.get(0);
			que.remove(0);
			if (newRow != maze.length - 1 && maze[newRow + 1][newColumn] == 1 && !visit[newRow + 1][newColumn]) {
				if (count[newRow + 1][newColumn] > count[newRow][newColumn] + 1 || count[newRow + 1][newColumn] == 0) {
					count[newRow + 1][newColumn] = count[newRow][newColumn] + 1;
				}
				visit[newRow + 1][newColumn] = true;
				que.add(newRow + 1);
				que.add(newColumn);
			}
			if (newColumn != maze[0].length - 1 && maze[newRow][newColumn + 1] == 1 && !visit[newRow][newColumn + 1]) {
				if (count[newRow][newColumn + 1] > count[newRow][newColumn] + 1 || count[newRow][newColumn + 1] == 0) {
					count[newRow][newColumn + 1] = count[newRow][newColumn] + 1;
				}
				visit[newRow][newColumn + 1] = true;
				que.add(newRow);
				que.add(newColumn + 1);
			}
			if (newRow != 0 && maze[newRow - 1][newColumn] == 1 && !visit[newRow - 1][newColumn]) {
				if (count[newRow - 1][newColumn] > count[newRow][newColumn] + 1 || count[newRow - 1][newColumn] == 0) {
					count[newRow - 1][newColumn] = count[newRow][newColumn] + 1;
				}
				visit[newRow - 1][newColumn] = true;
				que.add(newRow - 1);
				que.add(newColumn);

			}
			if (newColumn != 0 && maze[newRow][newColumn - 1] == 1 && !visit[newRow][newColumn - 1]) {
				if (count[newRow][newColumn - 1] > count[newRow][newColumn] + 1 || count[newRow][newColumn - 1] == 0) {
					count[newRow][newColumn - 1] = count[newRow][newColumn] + 1;
				}
				visit[newRow][newColumn - 1] = true;
				que.add(newRow);
				que.add(newColumn - 1);

			}
		}
	}
}
