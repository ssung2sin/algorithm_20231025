package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class A8979 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Country> countries = new ArrayList<>();
		int testCase = Integer.parseInt(st.nextToken());
		int pickCountry = Integer.parseInt(st.nextToken());
		for (int count = 0; count < testCase; count++) {
			st = new StringTokenizer(br.readLine());
			int[] country = new int[4];
			for (int i = 0; i < 4; i++) {
				country[i] = Integer.parseInt(st.nextToken());
			}
			Country newCountry = new Country(country[0], country[1], country[2], country[3]);
			countries.add(newCountry);
		}
		countries.sort(comp);

		printCountryGrade(countries, testCase, pickCountry);
	}

	public static class Country {
		int countryNumber;
		int goldCount;
		int silverCount;
		int bronzeCount;

		public Country(int nubmer, int gold, int silver, int bronze) {
			this.countryNumber = nubmer;
			this.goldCount = gold;
			this.silverCount = silver;
			this.bronzeCount = bronze;
		}
	}

	public static Comparator<Country> comp = new Comparator<Country>() {
		@Override
		public int compare(Country o1, Country o2) {
			if (o1.goldCount > o2.goldCount) {
				return -1;
			} else if (o1.goldCount == o2.goldCount) {
				if (o1.silverCount > o2.silverCount) {
					return -1;
				} else if (o1.silverCount == o2.silverCount) {
					if (o1.bronzeCount > o2.bronzeCount) {
						return -1;
					}
				}
			}
			return 0;
		}
	};

	public static void printCountryGrade(List<Country> countries, int testCase, int pickCountry) {
		for (int countryCount = 0; countryCount < testCase; countryCount++) {
			Country country = countries.get(countryCount);
			if (country.countryNumber == pickCountry) {
				int count = 0;
				if (countryCount > 0) {
					while (true) {
						if (countryCount - (count + 1) == 0) {
							break;
						}
						Country otherCountry = countries.get(countryCount - (count + 1));
						if (otherCountry.bronzeCount == country.bronzeCount
							&& otherCountry.silverCount == country.silverCount
							&& otherCountry.goldCount == country.goldCount) {
							count++;
						} else {
							break;
						}
					}
				}
				System.out.println(countryCount + 1 - count);
			}
		}
	}
}
