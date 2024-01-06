package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int inputTime = Integer.parseInt(bf.readLine());
		int[] number = new int[inputTime];

		for (int index = 0; index < inputTime; index++) {
			number[index] = Integer.parseInt(bf.readLine());
		}
		int[] temp = new int[inputTime];

		mergeSort(number, temp, 0, number.length - 1);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int index = 0; index < number.length; index++) {
			bw.write(number[index] + "\n");
		}
		bw.close();
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
		for (int i = start; i <= end; i++) {
			temp[i] = number[i];
		}
		while (part1 <= mid && part2 <= end) {
			if (temp[part1] > temp[part2]) {
				number[index] = temp[part2];
				part2++;
			} else {
				number[index] = temp[part1];
				part1++;
			}
			index++;
		}
		for (int i = 0; i <= mid - part1; i++) {
			number[index + i] = temp[part1 + i];
		}
	}
}
