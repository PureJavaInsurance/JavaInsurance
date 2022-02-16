package Employee;

import Customer.Customer;
import Insurance.Insurance;

public class Employee {
	
	private Customer customer;
	private Insurance insurance;

	public void associate(Customer customer, Insurance insurance) {
		this.customer = customer;
		this.insurance = insurance; 
	}

}
