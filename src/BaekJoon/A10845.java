package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A10845 {
	static class Queue {

		List<Integer> queue;

		Queue() {
			queue = new ArrayList<>();
		}

		void push(int number) {
			queue.add(number);
		}

		void pop() {
			if (!queue.isEmpty()) {
				System.out.println(queue.get(0));
				queue.remove(0);
			} else {
				System.out.println("-1");
			}
		}

		void size() {
			System.out.println(queue.size());
		}

		void empty() {
			if (queue.isEmpty()) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

		void front() {
			if (queue.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(queue.get(0));
			}
		}

		void back() {
			if (queue.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(queue.get(queue.size() - 1));
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());

		Queue queue = new Queue();

		StringTokenizer st;
		for (int index = 0; index < repeat; index++) {
			st = new StringTokenizer(br.readLine());
			String inputText = st.nextToken();
			if (inputText.equals("push")) {
				int number = Integer.parseInt(st.nextToken());
				queue.push(number);
			} else if (inputText.equals("pop")) {
				queue.pop();
			} else if (inputText.equals("size")) {
				queue.size();
			} else if (inputText.equals("empty")) {
				queue.empty();
			} else if (inputText.equals("front")) {
				queue.front();
			} else if (inputText.equals("back")) {
				queue.back();
			}
		}
	}
}
