package BaekJoon;

import java.util.Scanner;

public class A2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputTime = sc.nextInt();
		int[] number = new int[inputTime];

		for (int index = 0; index < inputTime; index++) {
			number[index] = sc.nextInt();
		}
		int[] temp = new int[inputTime];

		mergeSort(number, temp, 0, number.length - 1);

		for (int index = 0; index < number.length; index++) {
			System.out.println(temp[index]);
		}
	}

	private static void mergeSort(int[] number, int[] temp, int start, int end) {
		if (start < end) {
			int mid = (end + start) / 2;
			mergeSort(number, temp, start, mid);
			mergeSort(number, temp, mid + 1, end);
			merge(number, temp, start, mid, end);
		}
	}

	private static void merge(int[] number, int[] temp, int start, int mid, int end) {
		int part1 = start;
		int part2 = mid + 1;
		int index = start;
		for (int i = 0; i <= end; i++) {
			temp[i] = number[i];
		}
		while (part1 <= mid && part2 <= end) {
			if (number[part1] > number[part2]) {
				number[index] = temp[part2];
				part2++;
			} else {
				number[index] = temp[part1];
				part1++;
			}
			index++;
		}
		for (int i = 0; i <= mid - part1; i++) {
			number[index + i] = temp[index + i];
		}
	}
}
