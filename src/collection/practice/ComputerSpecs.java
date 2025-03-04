package collection.practice;

import lombok.Data;

@Data
public class ComputerSpecs {
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
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
