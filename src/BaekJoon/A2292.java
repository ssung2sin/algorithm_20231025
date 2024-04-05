package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		int divideSix = (number - 1) / 6;
		if ((number - 1) % 6 != 0) {
			divideSix++;
		}
		int index = 2;
		while (true) {
			if (divideSix == 0) {
				System.out.println("1");
				break;
			} else {
				if (divideSix > (index - 2) * (index - 1) / 2 && divideSix <= (index - 1) * index / 2) {
					System.out.println(index);
					break;
				}
			}
			index++;
		}

	}
}
