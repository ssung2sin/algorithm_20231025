package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class A1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int number = Integer.parseInt(st.nextToken());
		int pickNumber = Integer.parseInt(st.nextToken());
		List<Integer> numberList = new LinkedList<>();
		for (int index = 0; index < number; index++) {
			numberList.add(index + 1);
		}
		int idx = 0;
		System.out.print("<");
		while (!numberList.isEmpty()) {
			idx += pickNumber - 1;
			if (idx >= numberList.size()) {
				idx %= numberList.size();
			}
			if (numberList.size() == 1) {
				System.out.print(numberList.get(idx));
			} else {
				System.out.print(numberList.get(idx) + ", ");
			}
			numberList.remove(idx);
		}
		System.out.print(">");
	}
}
