package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> firstNumber = new ArrayList<>();
		List<Integer> secondNumber = new ArrayList<>();
		int index = 0;
		while (true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());

			firstNumber.add(Integer.parseInt(st.nextToken()));
			secondNumber.add(Integer.parseInt(st.nextToken()));
			if (firstNumber.get(index) == 0 && secondNumber.get(index) == 0) {
				break;
			}
			index++;
		}

		for (index = 0; index < firstNumber.size() - 1; index++) {
			if (firstNumber.get(index) % secondNumber.get(index) == 0) {
				System.out.println("multiple");
			} else if (secondNumber.get(index) % firstNumber.get(index) == 0) {
				System.out.println("factor");
			} else {
				System.out.println("neither");
			}

		}
	}
}
