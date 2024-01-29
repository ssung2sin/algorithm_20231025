package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A14226_Wrong {
	private static int[] count;
	private static boolean[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int emoticon = sc.nextInt();
		count = new int[1001];
		visit = new boolean[1001];
		visit[1] = true;
		findSolvedWithBFS(emoticon, 1);
		System.out.println(count[emoticon]);
	}

	private static void findSolvedWithBFS(int emoticon, int presentEmoticon) {
		List<Integer> emoticonList = new ArrayList<>();
		List<Integer> clipEmoticonList = new ArrayList<>();
		emoticonList.add(presentEmoticon);
		clipEmoticonList.add(0);
		while (!emoticonList.isEmpty()) {
			presentEmoticon = emoticonList.remove(0);
			int clipEmoticon = clipEmoticonList.remove(0);
			if (presentEmoticon > 1 && !visit[presentEmoticon - 1]) {
				count[presentEmoticon - 1] = count[presentEmoticon] + 1;
				visit[presentEmoticon - 1] = true;
				if (presentEmoticon - 1 == emoticon) {
					return;
				}
				emoticonList.add(presentEmoticon - 1);
				clipEmoticonList.add(clipEmoticon);

			}
			if (presentEmoticon + clipEmoticon < 1001 && clipEmoticon != 0 && !visit[presentEmoticon + clipEmoticon]) {
				count[presentEmoticon + clipEmoticon] = count[presentEmoticon] + 1;
				visit[presentEmoticon + clipEmoticon] = true;
				if (presentEmoticon + clipEmoticon == emoticon) {
					return;
				}
				emoticonList.add(presentEmoticon + clipEmoticon);
				clipEmoticonList.add(clipEmoticon);
			}
			if (presentEmoticon < 1001 && presentEmoticon != clipEmoticon) {
				count[presentEmoticon] = count[presentEmoticon] + 1;
				emoticonList.add(presentEmoticon);
				clipEmoticonList.add(presentEmoticon);
			}
		}
	}
}
