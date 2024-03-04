package collection.practice;

import lombok.Data;


public class Apartment {
	
	@Override
	public String toString() {
		return "Apartment [numberOfFlats=" + numberOfFlats + ", name=" + name + ", numberOfBlocks=" + numberOfBlocks
				+ ", totalCost=" + totalCost + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfBlocks;
		result = prime * result + numberOfFlats;
		result = prime * result + totalCost;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apartment other = (Apartment) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfBlocks != other.numberOfBlocks)
			return false;
		if (numberOfFlats != other.numberOfFlats)
			return false;
		if (totalCost != other.totalCost)
			return false;
		return true;
	}


	private int numberOfFlats;
	private String name;
	private int numberOfBlocks;
	private int totalCost;
	
	public Apartment(int numberOfFlats, String name, int numberOfBlocks, int totalCost) {
		super();
		this.numberOfFlats = numberOfFlats;
		this.name = name;
		this.numberOfBlocks = numberOfBlocks;
		this.totalCost = totalCost;
	}

	
	public Apartment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
