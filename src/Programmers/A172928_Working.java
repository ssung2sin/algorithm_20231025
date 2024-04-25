package Programmers;

public class A172928_Working {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] park = {"SOO", "OOO", "OOO"};
		String[] routes = {"E 2", "S 2", "W 1"};
		solution.solution(park, routes);
	}

	static class Solution {
		public int[] solution(String[] park, String[] routes) {
			boolean[][] coordinates = new boolean[park.length][park[0].length()];
			int x = 0, y = 0;
			for (int i = 0; i < park.length; i++) {
				String text = park[i];
				for (int j = 0; j < text.length(); j++) {
					if (text.charAt(j) == 'S') {
						x = i;
						y = j;
					}
					if (text.charAt(j) == 'X') {
						coordinates[i][j] = true;
					}
				}
			}
			System.out.println(x + " , " + y);
			for (int i = 0; i < routes.length; i++) {
				String[] temp = routes[i].split(" ");
				String nsew = temp[0];
				int distance = Integer.parseInt(temp[1]);
				if (nsew.equals("E")) {
					if (y + distance <= coordinates[0].length - 1) {
						boolean flag = true;
						for (int j = 1; j <= distance; j++) {
							if (coordinates[x][y + j]) {
								flag = false;
							}
						}
						if (flag) {
							y += distance;
						}
					}
				} else if (nsew.equals("W")) {
					if (y - distance >= 0) {
						boolean flag = true;
						for (int j = 1; j <= distance; j++) {
							if (coordinates[x][y - j]) {
								flag = false;
							}
						}
						if (flag) {
							y -= distance;
						}
					}
				} else if (nsew.equals("S")) {
					if (x + distance <= coordinates.length - 1) {
						boolean flag = true;
						for (int j = 1; j <= distance; j++) {
							if (coordinates[x + j][y]) {
								flag = false;
							}
						}
						if (flag) {
							x += distance;
						}
					}
				} else if (nsew.equals("N")) {
					if (x - distance >= 0) {
						boolean flag = true;
						for (int j = 1; j <= distance; j++) {
							if (coordinates[x - j][y]) {
								flag = false;
							}
						}
						if (flag) {
							x -= distance;
						}
					}
				}
			}
			int[] answer = {x, y};
			return answer;
		}
	}
}
