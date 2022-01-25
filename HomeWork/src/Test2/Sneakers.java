package Test2;

import Interface.WinterThings;

public class Sneakers extends Things implements WinterThings {

	public String category;
	
	public Sneakers(String type) {
		super(type);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Sneakers [category=" + category + "]";
	}

	@Override
	public void jackets() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hats() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shorts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caps() {
		// TODO Auto-generated method stub
		
	}
	
}
