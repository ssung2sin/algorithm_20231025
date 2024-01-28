package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A2606 {
	private static int count;
	private static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numberCount = Integer.parseInt(br.readLine());
		int testCase = Integer.parseInt(br.readLine());

		boolean[][] linkedNumber = new boolean[numberCount + 1][numberCount + 1];
		visit = new boolean[numberCount + 1];

		for (int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			linkedNumber[x][y] = true;
			linkedNumber[y][x] = true;
		}
		findVirusWithBFS(linkedNumber, 1);
		System.out.println(count);
	}

	private static void findVirusWithBFS(boolean[][] linkedNumber, int virus) {
		List<Integer> que = new ArrayList<>();
		for (int i = 1; i < linkedNumber.length; i++) {
			if (linkedNumber[virus][i]) {
				que.add(i);
				visit[virus] = true;
			}
		}
		while (!que.isEmpty()) {
			int nextNumber = que.remove(0);
			if (visit[nextNumber]) {
				continue;
			}
			count++;
			visit[nextNumber] = true;
			for (int i = 1; i < linkedNumber.length; i++) {
				if (linkedNumber[nextNumber][i] && !visit[i]) {
					que.add(i);
				}
			}
		}
	}
}
