package Programmers;

import java.util.ArrayList;
import java.util.List;

public class A161989_PaintingOver {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] n = new int[3];
		int[] m = new int[3];
		List<int[]> section = new ArrayList<>();
		inputValue(n, m, section);
		for (int i = 0; i < n.length; i++) {
			System.out.println(solution.solution(n[i], m[i], section.get(i)) + ",");
			System.out.println(solution.anotherSolution(n[i], m[i], section.get(i)));
		}
	}

	public static void inputValue(int[] n, int[] m, List<int[]> section) {
		int[] newInt = new int[3];
		newInt[0] = 2;
		newInt[1] = 3;
		newInt[2] = 6;
		section.add(newInt);
		newInt = new int[2];
		newInt[0] = 1;
		newInt[1] = 3;
		section.add(newInt);
		newInt = new int[4];
		newInt[0] = 1;
		newInt[1] = 2;
		newInt[2] = 3;
		newInt[3] = 4;
		section.add(newInt);
		n[0] = 8;
		n[1] = 5;
		n[2] = 4;
		m[0] = 4;
		m[1] = 4;
		m[2] = 1;
	}

	static class Solution {
		public int solution(int n, int m, int[] section) {
			boolean[] paintArea = new boolean[n + 1];
			checkPaintArea(paintArea, section);
			int count = 0;
			int paintCount = section.length;
			if (paintCount != 0) {
				for (int i = 1; i < paintArea.length; i++) {
					if (paintArea[i] && i + m <= n) {
						count++;
						i += m - 1;
					} else if (paintArea[i] && i + m > n) {
						count++;
						break;
					}
				}
			}
			return count;
		}

		public int anotherSolution(int n, int m, int[] section) {
			int roller = section[0];
			int cnt = 1;
			for (int i = 1; i < section.length; i++) {
				if (roller + m - 1 < section[i]) {
					cnt++;
					roller = section[i];
				}
			}
			return cnt;
		}

		public void checkPaintArea(boolean[] paintArea, int[] section) {
			for (int value = 0; value < section.length; value++) {
				int number = section[value];
				paintArea[number] = true;
			}
		}
	}
}
