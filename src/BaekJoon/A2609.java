package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.StringTokenizer;

public class A2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int numberA = Integer.parseInt(st.nextToken());
		int numberB = Integer.parseInt(st.nextToken());
		Set<Integer> indexA = new HashSet<>();
		Set<Integer> indexB = new HashSet<>();
		int[] primeFactorA = new int[numberA + 1];
		int[] primeFactorB = new int[numberB + 1];

		while (numberA > 1) {
			for (int i = 2; i <= numberA; i++) {
				if (numberA % i == 0) {
					numberA /= i;
					primeFactorA[i]++;
					indexA.add(i);
					break;
				}
			}
		}

		while (numberB > 1) {
			for (int i = 2; i <= numberB; i++) {
				if (numberB % i == 0) {
					numberB /= i;
					primeFactorB[i]++;
					indexB.add(i);
					break;
				}
			}
		}

		//일반적으로 최대공배수 공약수 구하는 공식
		/*int gcd = 1;
		int lcm = 1;
		while (true) {
			int index = 2;
			if (numberA - numberB > 0) {
				for (index = 2; index <= numberB; index++) {
					if (numberB % index == 0 && numberA % index == 0) {
						gcd *= index;
						numberA /= index;
						numberB /= index;
					}
				}
			} else {
				for (index = 2; index <= numberA; index++) {
					if (numberB % index == 0 && numberA % index == 0) {
						gcd *= index;
						numberA /= index;
						numberB /= index;
					}
				}
			}
			if (index == numberA || index == numberB || numberA == 1 || numberB == 1) {
				lcm *= numberA;
				lcm *= numberB;
				break;
			}
		}

		System.out.println(gcd);
		System.out.println(lcm * gcd);*/

		List<Integer> indexListA = new ArrayList<>(indexA);
		List<Integer> indexListB = new ArrayList<>(indexB);
		int gcd = calculateGCD(indexListA, indexListB, primeFactorA, primeFactorB);
		System.out.println(gcd);
		int lcm = calculateLCM(indexListA, indexListB, primeFactorA, primeFactorB, gcd);
		System.out.println(lcm);
	}

	private static int calculateGCD(List<Integer> indexListA, List<Integer> indexListB, int[] primeFactorA,
		int[] primeFactorB) {
		int result = 1;
		for (int idxA = 0; idxA < indexListA.size(); idxA++) {
			for (int idxB = 0; idxB < indexListB.size(); idxB++) {
				if (Objects.equals(indexListA.get(idxA), indexListB.get(idxB))) {
					if (primeFactorA[indexListA.get(idxA)] > primeFactorB[indexListA.get(idxA)]) {
						for (int i = 0; i < primeFactorB[indexListB.get(idxB)]; i++) {
							result *= indexListB.get(idxB);
						}
					} else {
						for (int i = 0; i < primeFactorA[indexListA.get(idxA)]; i++) {
							result *= indexListA.get(idxA);
						}
					}
				}
			}
		}
		return result;
	}

	private static int calculateLCM(List<Integer> indexListA, List<Integer> indexListB, int[] primeFactorA,
		int[] primeFactorB, int gcd) {
		int result = 1;
		for (int idxA = 0; idxA < indexListA.size(); idxA++) {
			for (int i = 0; i < primeFactorA[indexListA.get(idxA)]; i++) {
				result *= indexListA.get(idxA);
			}
		}
		for (int idxB = 0; idxB < indexListB.size(); idxB++) {
			for (int i = 0; i < primeFactorB[indexListB.get(idxB)]; i++) {
				result *= indexListB.get(idxB);
			}
		}
		return result / gcd;
	}
}
