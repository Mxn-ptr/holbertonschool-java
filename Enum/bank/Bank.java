import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Branch> getBranches() {
		return this.branches;
	}

	public Branch findBranch(String branchName) {
		for (Branch branch: this.branches) {
			if (branch.getName().equals(branchName))
				return branch;
		}
		return null;
	}

	public boolean addBranch(String branchName) {
		if (this.findBranch(branchName) != null)
			return false;
		this.branches.add(new Branch(branchName));
		return true;
	}

	public boolean addCustomer(String branchName, String customerName, double customerTransaction) {
		Branch branch = this.findBranch(branchName);
		if (branch != null) {
			return branch.newCustomer(customerName, customerTransaction);
		}
		return false;
	}

	public boolean addCustomerTransaction(String branchName, String customerName, double customerTransaction) {
		Branch branch = this.findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerTransaction(customerName, customerTransaction);
		}
		return false;
	}

	public boolean listCustomers(String branchName, boolean transactions) {
		Branch branch = this.findBranch(branchName);
		if (branch == null) {
			return false;
		}
		String output = new String();
		for (int i = 0; i < branch.getCustomers().size(); i++) {
			output += String.format("Client: %s [%d]\n", branch.getCustomers().get(i).getName(), i + 1);
			if (transactions) {
				for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++) {
					double transaction = branch.getCustomers().get(i).getTransactions().get(j);
					output += String.format("  [%d] value %.2f\n", j + 1, transaction);
				}
			}
		}
		System.out.println(output);
		return true;
	}
}
