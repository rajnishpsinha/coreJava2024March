package collection.practice;

import lombok.Data;

@Data
public class ComputerSpecs {
	private int storage;
	private int cost;
	private String brand;
	public ComputerSpecs(int storage, int cost, String brand) {
		super();
		this.storage = storage;
		this.cost = cost;
		this.brand = brand;
	}
	

}
