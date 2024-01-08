package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A10866 {
	static class Deque {
		List<Integer> deque;

		Deque() {
			deque = new ArrayList<>();
		}

		void pushBack(int number) {
			deque.add(number);
		}

		void pushFront(int number) {
			List<Integer> list = new ArrayList<>(deque);
			deque.clear();

			deque.add(number);
			deque.addAll(list);
		}

		void popFront() {
			if (deque.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(deque.get(0));
				deque.remove(0);
			}
		}

		void popBack() {
			if (deque.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(deque.get((deque.size() - 1)));
				deque.remove((deque.size() - 1));
			}
		}

		void size() {
			System.out.println(deque.size());
		}

		void empty() {
			if (deque.isEmpty()) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

		void front() {
			if (deque.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(deque.get(0));
			}
		}

		void back() {
			if (deque.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(deque.get((deque.size() - 1)));
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int repeat = Integer.parseInt(br.readLine());

		Deque deque = new Deque();

		for (int index = 0; index < repeat; index++) {
			st = new StringTokenizer(br.readLine());
			String inputText = st.nextToken();
			if (inputText.equals("push_front")) {
				int number = Integer.parseInt(st.nextToken());
				deque.pushFront(number);
			} else if (inputText.equals("push_back")) {
				int number = Integer.parseInt(st.nextToken());
				deque.pushBack(number);
			} else if (inputText.equals("pop_front")) {
				deque.popFront();
			} else if (inputText.equals("pop_back")) {
				deque.popBack();
			} else if (inputText.equals("size")) {
				deque.size();
			} else if (inputText.equals("empty")) {
				deque.empty();
			} else if (inputText.equals("front")) {
				deque.front();
			} else if (inputText.equals("back")) {
				deque.back();
			}
		}
	}
}
