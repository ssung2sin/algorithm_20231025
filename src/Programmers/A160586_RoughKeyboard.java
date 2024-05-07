package Programmers;

import java.util.HashMap;
import java.util.Map;

public class A160586_RoughKeyboard {
	public static void main(String[] args) {

	}

	static class Solution {
		public int[] solution(String[] keymap, String[] targets) {
			Map<Character, Integer> alphabetMap = new HashMap<>();
			initAlphabetMap(alphabetMap);

			initMapValues(alphabetMap, keymap);

			int[] answer = checkTargets(alphabetMap, targets);

			return answer;
		}

		private void initAlphabetMap(Map<Character, Integer> alphabetMap) {
			for (int alphabetCount = 0; alphabetCount < 26; alphabetCount++) {
				char alphabet = (char)(alphabetCount + 65);
				alphabetMap.put(alphabet, 100);
			}
		}

		private void initMapValues(Map<Character, Integer> alphabetMap, String[] keymap) {
			for (int keymapCount = 0; keymapCount < keymap.length; keymapCount++) {
				compareMapsValue(alphabetMap, keymap[keymapCount]);
			}
		}

		private void compareMapsValue(Map<Character, Integer> alphabetMap, String keymap) {
			for (int keymaplength = 0; keymaplength < keymap.length(); keymaplength++) {
				char alphabet = keymap.charAt(keymaplength);
				if (alphabetMap.containsKey(alphabet) &&
					alphabetMap.get(alphabet) > keymaplength + 1) {
					alphabetMap.replace(alphabet, keymaplength + 1);
				}
			}
		}

		private int[] checkTargets(Map<Character, Integer> alphabetMap, String[] targets) {
			int[] result = new int[targets.length];
			for (int targetCount = 0; targetCount < targets.length; targetCount++) {
				result[targetCount] = checktargetCount(alphabetMap, targets[targetCount]);
			}
			return result;
		}

		private int checktargetCount(Map<Character, Integer> alphabetMap, String target) {
			int count = 0;
			for (int targetLength = 0; targetLength < target.length(); targetLength++) {
				if (alphabetMap.get(target.charAt(targetLength)) == 100) {
					return -1;
				}
				count += alphabetMap.get(target.charAt(targetLength));
			}
			return count;
		}
	}
}
