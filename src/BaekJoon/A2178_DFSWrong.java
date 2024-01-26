package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2178_DFSWrong {
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
		findExit(maze, 0, 0);

		System.out.println(count[row - 1][column - 1]);
	}

	private static void findExit(int[][] maze, int row, int column) {
		if (row != maze.length - 1 && maze[row + 1][column] == 1 && !visit[row + 1][column]) {
			if (count[row + 1][column] > count[row][column] + 1 || count[row + 1][column] == 0) {
				count[row + 1][column] = count[row][column] + 1;
			}
			visit[row + 1][column] = true;
			findExit(maze, row + 1, column);
			visit[row + 1][column] = false;
		}
		if (column != maze[0].length - 1 && maze[row][column + 1] == 1 && !visit[row][column + 1]) {
			if (count[row][column + 1] > count[row][column] + 1 || count[row][column + 1] == 0) {
				count[row][column + 1] = count[row][column] + 1;
			}
			visit[row][column + 1] = true;
			findExit(maze, row, column + 1);
			visit[row][column + 1] = false;
		}
		if (row != 0 && maze[row - 1][column] == 1 && !visit[row - 1][column]) {
			if (count[row - 1][column] > count[row][column] + 1 || count[row - 1][column] == 0) {
				count[row - 1][column] = count[row][column] + 1;
			}
			visit[row - 1][column] = true;
			findExit(maze, row - 1, column);
			visit[row - 1][column] = false;
		}
		if (column != 0 && maze[row][column - 1] == 1 && !visit[row][column - 1]) {
			if (count[row][column - 1] > count[row][column] + 1 || count[row][column - 1] == 0) {
				count[row][column - 1] = count[row][column] + 1;
			}
			visit[row][column - 1] = true;
			findExit(maze, row, column - 1);
			visit[row][column - 1] = false;
		}
	}
}
