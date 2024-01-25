package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class A1260 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int nodeCount = Integer.parseInt(st.nextToken());
		int nodeLine = Integer.parseInt(st.nextToken());
		int startNode = Integer.parseInt(st.nextToken());
		int[][] linkedNode = new int[nodeCount + 1][nodeCount + 1];
		boolean[] visitDFS = new boolean[nodeCount + 1];
		boolean[] visitBFS = new boolean[nodeCount + 1];

		for (int i = 0; i < nodeLine; i++) {
			st = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(st.nextToken());
			int column = Integer.parseInt(st.nextToken());
			if (linkedNode[row][column] == 1) {
				continue;
			}
			linkedNode[row][column]++;
			linkedNode[column][row]++;
		}
		System.out.print(startNode + " ");
		visitDFS[startNode] = true;
		findDFS(linkedNode, startNode, visitDFS);

		System.out.print("\n" + startNode + " ");
		visitBFS[startNode] = true;
		findBFS(linkedNode, startNode, visitBFS);
	}

	private static void findDFS(int[][] linkedNode, int startNode, boolean[] visit) {
		for (int i = 1; i < linkedNode[startNode].length; i++) {
			if (linkedNode[startNode][i] == 1 && !visit[i]) {
				System.out.print(i + " ");
				visit[i] = true;
				findDFS(linkedNode, i, visit);
			}
		}
	}

	private static void findBFS(int[][] linkedNode, int startNode, boolean[] visit) {
		List<Integer> checkNode = new LinkedList<>();
		List<Integer> nextNode = new LinkedList<>();
		checkNode.add(startNode);
		while (true) {
			int count = 0;
			for (int j = 0; j < checkNode.size(); j++) {
				for (int i = 1; i < linkedNode[startNode].length; i++) {
					if (linkedNode[checkNode.get(j)][i] == 1 && !visit[i]) {
						System.out.print(i + " ");
						visit[i] = true;
						nextNode.add(i);
						count++;
					}
				}
			}
			if (count == 0) {
				return;
			} else {
				checkNode = nextNode;
			}
		}

	}
}
