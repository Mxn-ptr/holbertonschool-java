import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;

	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Customer> getCustomers() {
		return this.customers;
	}

	public Customer findCustomer(String customerName) {
		for (Customer customer: this.customers) {
			if (customer.getName().equals(customerName))
				return customer;
		}
		return null;
	}

	public boolean newCustomer(String customerName, double customerTransaction) {
		if (findCustomer(customerName) != null)
			return false;
		this.customers.add(new Customer(customerName, customerTransaction));
		return true;
	}

	public boolean addCustomerTransaction(String customerName, double customerTransaction) {
		Customer customer = findCustomer(customerName);
		if (customer == null)
			return false;
		customer.addTransaction(customerTransaction);
		return true;
	}
}
