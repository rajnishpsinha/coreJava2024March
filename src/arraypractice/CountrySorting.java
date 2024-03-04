package arraypractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CountrySorting {
	public List<Country> sortCountry(List<Country> countryList) {

		Comparator<Country> countryComparator = (Country country1, Country country2) -> {

			int result = country1.getPopulation() - country2.getPopulation();

			return result;

		};
		Collections.sort(countryList, countryComparator);

		return countryList;
	}

	public static void main(String[] args) {

		CountrySorting countrySort = new CountrySorting();

		Country India = new Country("India", 140, 250);
		Country China = new Country("China", 160, 360);
		Country Japan = new Country("Japan", 40, 100);

		List<Country> asianCountryList = new ArrayList<Country>();
		asianCountryList.add(India);
		asianCountryList.add(China);
		asianCountryList.add(Japan);

		countrySort.sortCountry(asianCountryList);
		asianCountryList.stream().forEach(p -> System.out.println(p.getName() + " : " + p.getPopulation()));

	}

}
