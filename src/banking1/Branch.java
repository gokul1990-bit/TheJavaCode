package banking1;

import java.util.ArrayList;

public class Branch {

	private String name;

	private ArrayList<Customer> customers;

	public Branch(String name) {

		this.name = name;

		this.customers = new ArrayList<Customer>();

	}

	public String getName() {
		return name;
	}

	public boolean newCustomer(String CustomerName, double initialAmount) {

		if (findCustomer(CustomerName) == null) {

			this.customers.add(new Customer(CustomerName, initialAmount));

			return true;

		}

		return false;
	}
	
	
	

}
