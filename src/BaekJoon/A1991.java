package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1991 {

	static class Node {
		char data;
		Node leftNode;
		Node rightNode;

		public Node(char data, Node left, Node right) {
			this.data = data;
			this.leftNode = left;
			this.rightNode = right;
		}

		public void setData(char data, Node left, Node right) {
			this.data = data;
			this.leftNode = left;
			this.rightNode = right;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		Node node = new Node('A', null, null);

		int testCase = Integer.parseInt(st.nextToken());
		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			char data = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);

			insertNode(node, data, left, right);
			//이부분은 무조건 왼쪽은 왼쪽만 돌게, 오른쪽은 오른쪽만 돌아서 오류
			/*Node leftNode = null;
			Node rightNode = null;

			boolean leftFlag = false;
			while (newNode != null) {
				if (newNode.data == data) {
					if (left != '.') {
						leftNode = new Node(left, null, null);
					}
					if (right != '.') {
						rightNode = new Node(right, null, null);
					}
					leftFlag = true;
					newNode.setData(data, leftNode, rightNode);
					break;
				} else {
					newNode = newNode.leftNode;
				}
			}
			newNode = node;
			while (!leftFlag && newNode != null) {
				if (newNode.data == data) {
					if (left != '.') {
						leftNode = new Node(left, null, null);
					}
					if (right != '.') {
						rightNode = new Node(right, null, null);
					}
					leftFlag = true;
					newNode.setData(data, leftNode, rightNode);
					break;
				} else {
					newNode = newNode.rightNode;
				}
			}*/
		}
		preOrder(node);
		System.out.println();
		inOrder(node);
		System.out.println();
		postOrder(node);
	}

	private static void insertNode(Node node, char data, char left, char right) {
		if (node.data == data) {
			Node leftNode = null;
			Node rightNode = null;
			if (left != '.') {
				leftNode = new Node(left, null, null);
			}
			if (right != '.') {
				rightNode = new Node(right, null, null);
			}
			node.setData(data, leftNode, rightNode);
		} else {
			if (node.leftNode != null) {
				insertNode(node.leftNode, data, left, right);
			}
			if (node.rightNode != null) {
				insertNode(node.rightNode, data, left, right);
			}
		}
	}

	private static void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data);
			if (node.leftNode != null) {
				preOrder(node.leftNode);
			}
			if (node.rightNode != null) {
				preOrder(node.rightNode);
			}
		}
	}

	private static void inOrder(Node node) {
		if (node != null) {
			if (node.leftNode != null) {
				inOrder(node.leftNode);
			}
			System.out.print(node.data);
			if (node.rightNode != null) {
				inOrder(node.rightNode);
			}
		}
	}

	private static void postOrder(Node node) {
		if (node != null) {
			if (node.leftNode != null) {
				postOrder(node.leftNode);
			}
			if (node.rightNode != null) {
				postOrder(node.rightNode);
			}
			System.out.print(node.data);
		}
	}
}
