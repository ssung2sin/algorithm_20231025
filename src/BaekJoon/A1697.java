package BaekJoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1697 {

	private static int[] count;
	private static boolean[] visit;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int subinLocation = sc.nextInt();
		int brotherLocation = sc.nextInt();
		count = new int[100001];
		visit = new boolean[100001];

		findBFS(subinLocation, brotherLocation);

		System.out.println(count[brotherLocation]);

	}

	private static void findBFS(int subin, int brother) {
		List<Integer> BFSList = new ArrayList<>();
		BFSList.add(subin);
		if (brother < subin) {
			count[brother] = subin - brother;
			return;
		}
		while (!BFSList.isEmpty()) {
			int number = BFSList.remove(0);
			visit[number] = true;
			if ((number - 1) >= 0 && !visit[number - 1]) {
				count[number - 1] += count[number] + 1;
				visit[number - 1] = true;
				if (number - 1 == brother) {
					break;
				}
				BFSList.add(number - 1);
			}
			if ((number + 1) < 100001 && !visit[number + 1]) {
				count[number + 1] += count[number] + 1;
				visit[number + 1] = true;
				if (number + 1 == brother) {
					break;
				}
				BFSList.add(number + 1);
			}
			if (number * 2 < 100001 && !visit[number * 2]) {
				count[number * 2] += count[number] + 1;
				visit[number * 2] = true;
				if (number * 2 == brother) {
					break;
				}
				BFSList.add(number * 2);
			}
		}

	}

}
