package Programmers;

import java.util.ArrayList;
import java.util.List;

public class A161990_CleanUpWallpaper {
	public static void main(String[] args) {
		List<String[]> list = new ArrayList<>();
		String[] wallpaper = new String[] {".#...", "..#..", "...#."};
		list.add(wallpaper);
		wallpaper = new String[] {"..........", ".....#....", "......##..", "...##.....", "....#....."};
		list.add(wallpaper);
		wallpaper = new String[] {"..........", ".....#....", "......##..", "...##.....", "....#....."};
		list.add(wallpaper);
		wallpaper = new String[] {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...",
			"....#...."};
		list.add(wallpaper);
		wallpaper = new String[] {"..", "#."};
		list.add(wallpaper);
		Solution solution = new Solution();
		for (int i = 0; i < list.size(); i++) {
			int[] result = solution.solution(list.get(i));
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[j] + " ");
			}
			System.out.println();
		}
	}

	static class Solution {
		public int[] solution(String[] wallpaper) {
			int topX = wallpaper.length, topY = wallpaper[0].length(), botX = 0, botY = 0;
			boolean flag = false;
			for (int row = 0; row < wallpaper.length; row++) {
				for (int column = 0; column < wallpaper[row].length(); column++) {
					char file = wallpaper[row].charAt(column);
					if (file == '#' && !flag) {
						if (topX > row) {
							topX = row;
						}
						if (topY > column) {
							topY = column;
						}
						if (botX < row + 1) {
							botX = row + 1;
						}
						if (botY < column + 1) {
							botY = column + 1;
						}
					} else if (file == '#' && flag) {
						if (botX < row + 1) {
							botX = row + 1;
						}
						if (botY < column + 1) {
							botY = column + 1;
						}
					}
				}
			}
			int[] answer = {topX, topY, botX, botY};
			return answer;
		}
	}

	//다른 사람 solution MAX_VALUE MIN_VALUE, Math.min Math.max
	static class Solution1 {
		public int[] solution(String[] wallpaper) {
			int minX = Integer.MAX_VALUE;
			int minY = Integer.MAX_VALUE;
			int maxX = Integer.MIN_VALUE;
			int maxY = Integer.MIN_VALUE;
			for (int i = 0; i < wallpaper.length; i++) {
				for (int j = 0; j < wallpaper[i].length(); j++) {
					if (wallpaper[i].charAt(j) == '#') {
						minX = Math.min(minX, i);
						minY = Math.min(minY, j);
						maxX = Math.max(maxX, i);
						maxY = Math.max(maxY, j);
					}
				}
			}
			return new int[] {minX, minY, maxX + 1, maxY + 1};
		}
	}
}
