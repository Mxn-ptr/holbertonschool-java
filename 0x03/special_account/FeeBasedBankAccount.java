public class FeeBasedBankAccount extends BasicBankAccount {
	private int transactionCount = 0;

	public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
		super(accountNumber, annualInterestRate);
	}

	public int getTransactionCount() {
		return this.transactionCount;
	}

	@Override
	public void withdraw(double value) throws Exception {
		super.withdraw(value);
		this.setBalance(this.getBalance() - 0.10);
		this.transactionCount++;
	}

	@Override
	public void deposit(double value) throws Exception {
		super.deposit(value);
		this.setBalance(this.getBalance() - 0.10);
		this.transactionCount++;
	}
}
