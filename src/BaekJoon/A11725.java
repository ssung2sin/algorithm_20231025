package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A11725 {
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testNode = Integer.parseInt(br.readLine());
		ArrayList<Integer>[] node = new ArrayList[testNode + 1];
		for (int i = 0; i < testNode + 1; i++) {
			node[i] = new ArrayList<>();
		}

		for (int i = 0; i < testNode - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int numberA = Integer.parseInt(st.nextToken());
			int numberB = Integer.parseInt(st.nextToken());
			node[numberA].add(numberB);
			node[numberB].add(numberA);
		}
		for (int i = 2; i <= testNode; i++) {
			visit = new boolean[testNode + 1];
			findDFSWithLinkedNode(i, node, visit, 1);
		}

		System.out.println(sb);
	}

	private static void findDFSWithLinkedNode(int findNode, List<Integer>[] node, boolean[] visit, int startNode) {
		visit[startNode] = true;
		for (int i = 0; i < node[startNode].size(); i++) {
			int linkedNumber = node[startNode].get(i);
			if (!visit[linkedNumber]) {
				if (linkedNumber == findNode) {
					sb.append(startNode);
					sb.append("\n");
				} else {
					findDFSWithLinkedNode(findNode, node, visit, linkedNumber);
				}
			}
		}
	}
}
