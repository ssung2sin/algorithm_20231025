package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10828_LinkedList {
	static class Stack {

		Node header;

		static class Node {
			int data;
			Node next = null;
		}

		Stack() {
			header = new Node();
		}

		void push(int number) {
			Node end = new Node();
			end.data = number;
			Node node = header;
			while (node.next != null) {
				node = node.next;
			}
			node.next = end;
		}

		void pop() {
			Node node = header;
			Node prevNode = node;
			int size = 0;
			while (node.next != null) {
				prevNode = node;
				node = node.next;
				size++;
			}
			if (size == 0) {
				System.out.println("-1");
			} else {
				System.out.println(node.data);
				prevNode.next = null;
			}
		}

		void size() {
			int size = 0;
			Node node = header;
			while (node.next != null) {
				node = node.next;
				size++;
			}
			System.out.println(size);
		}

		void empty() {
			Node node = header;
			if (node.next != null) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		}

		void top() {
			Node node = header;
			int size = 0;
			while (node.next != null) {
				node = node.next;
				size++;
			}
			if (size == 0) {
				System.out.println("-1");
			} else {
				System.out.println(node.data);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int repeat = Integer.parseInt(st.nextToken());

		Stack stack = new Stack();

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
