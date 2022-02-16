package Customer;

import Insurance.Insurance;

public class Customer {

	private Insurance insurance;
	
	public void associate(Insurance insurance) {
		this.insurance = insurance;
	}
}
