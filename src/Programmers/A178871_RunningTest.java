package Programmers;

import java.util.HashMap;
import java.util.Map;

public class A178871_RunningTest {
	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		Solution solution = new Solution();
		String[] answer = solution.solution(players, callings);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	static class Solution {

		public String[] solution(String[] players, String[] callings) {
			Map<String, Integer> answerMap = new HashMap<>();
			for (int i = 0; i < players.length; i++) {
				answerMap.put(players[i], i);
			}
			for (int i = 0; i < callings.length; i++) {
				int playerRanking = answerMap.get(callings[i]);
				String frontPlayer = players[playerRanking - 1];
				answerMap.replace(frontPlayer, playerRanking);
				players[playerRanking] = frontPlayer;

				answerMap.replace(callings[i], playerRanking - 1);
				players[playerRanking - 1] = callings[i];
			}
			return players;
		}
	}
}
