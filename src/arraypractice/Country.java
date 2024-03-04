package arraypractice;

import lombok.Data;

@Data
public class Country {

	private String name;
	private Integer population;
	private Integer areaInSquarekm;

	public Country(String name, Integer population, Integer areaInSquarekm) {
		super();
		this.name = name;
		this.population = population;
		this.areaInSquarekm = areaInSquarekm;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

}
