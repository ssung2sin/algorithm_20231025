package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class A25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double tot = 0;
		int count = 0;
		Map<String, Double> standardGrade = new HashMap<>();
		mapInit(standardGrade);

		List<String> object = new ArrayList<>();
		List<Double> studentGrade = new ArrayList<>();
		List<String> record = new ArrayList<>();

		for (int index = 0; index < 20; index++) {
			st = new StringTokenizer(bf.readLine());
			object.add(st.nextToken());
			studentGrade.add(Double.parseDouble(st.nextToken()));
			record.add(st.nextToken());
		}

		for (int index = 0; index < object.size(); index++) {
			if (record.get(index).equals("P")) {
			} else if (record.get(index).equals("F")) {
				count += studentGrade.get(index);
			} else {
				count += studentGrade.get(index);
				tot += studentGrade.get(index) * compareGrade(record.get(index), standardGrade);
			}
		}
		System.out.printf("%.6f", tot / count);
	}

	private static void mapInit(Map<String, Double> grade) {
		grade.put("A+", 4.5);
		grade.put("A0", 4.0);
		grade.put("B+", 3.5);
		grade.put("B0", 3.0);
		grade.put("C+", 2.5);
		grade.put("C0", 2.0);
		grade.put("D+", 1.5);
		grade.put("D0", 1.0);
	}

	private static double compareGrade(String grade, Map<String, Double> standardGrade) {
		return standardGrade.get(grade);
	}
}
