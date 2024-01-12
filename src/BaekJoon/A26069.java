package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class A26069 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int repeatNumber = Integer.parseInt(st.nextToken());
		Set<String> seeRainBowPeople = new HashSet<>();

		for (int index = 0; index < repeatNumber; index++) {
			st = new StringTokenizer(br.readLine());
			String peopleA = st.nextToken();
			String peopleB = st.nextToken();
			if (peopleA.equals("ChongChong") || peopleB.equals("ChongChong")) {
				seeRainBowPeople.add(peopleA);
				seeRainBowPeople.add(peopleB);
				continue;
			}
			int setSize = seeRainBowPeople.size();
			seeRainBowPeople.remove(peopleA);
			seeRainBowPeople.remove(peopleB);
			if (seeRainBowPeople.size() != setSize) {
				seeRainBowPeople.add(peopleA);
				seeRainBowPeople.add(peopleB);
			}
		}

		System.out.println(seeRainBowPeople.size());
	}
}
