package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10828_Array {
	static class Stack {

		int index;
		int[] data;

		Stack(int length) {
			data = new int[length];
			index = -1;

		}

		void push(int number) {
			index++;
			data[index] = number;
		}

		void pop() {
			if (index == -1) {
				System.out.println("-1");
			} else if (index >= 0) {
				System.out.println(data[index]);
				index--;
			}
		}

		void size() {
			System.out.println(index + 1);
		}

		void empty() {
			if (index == -1) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

		void top() {
			if (index == -1) {
				System.out.println("-1");
			} else {
				System.out.println(data[index]);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int repeat = Integer.parseInt(st.nextToken());

		Stack stack = new Stack(repeat);

		for (int index = 0; index < repeat; index++) {
			st = new StringTokenizer(bf.readLine());
			String text = st.nextToken();

			if (text.equals("push")) {
				int number = Integer.parseInt(st.nextToken());
				stack.push(number);
			} else if (text.equals("pop")) {
				stack.pop();
			} else if (text.equals("size")) {
				stack.size();
			} else if (text.equals("empty")) {
				stack.empty();
			} else if (text.equals("top")) {
				stack.top();
			}

		}
	}
}
