import exceptions.InvalidOperationException;

public class BasicBankAccount {
	private String accountNumber;
	private double balance;
	private double annualInterestRate;

	public BasicBankAccount(String accountNumber, double annualInterestRate) {
		this.accountNumber = accountNumber;
		this.annualInterestRate = annualInterestRate;
		this.balance = 0;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	public void deposit(double value) throws Exception {
		if (value <= 0)
			throw new InvalidOperationException("Deposit amount must be greater than 0");
		this.balance += value;
	}

	public void withdraw(double value) throws Exception {
		if (value <= 0)
			throw new InvalidOperationException("Withdrawal amount must be greater than 0");
		else if ((this.balance - value) < 0)
			throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
		else
			this.balance -= value;
	}

	public double calculateMonthlyFee() {
		return Math.min(this.balance / 10, 10);
	}

	public double calculateMonthlyInterest() {
		if (this.balance >= 0)
			return this.balance * ((this.annualInterestRate / 12) / 100);
		return 0;
	}

	public void applyMonthlyUpdate() {
		this.balance += calculateMonthlyInterest() - calculateMonthlyFee();
	}
}
