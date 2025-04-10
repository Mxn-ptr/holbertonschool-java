public class ControlledBankAccount extends BasicBankAccount {
	private double minimumBalance;
	private double penaltyAmount;

	public ControlledBankAccount(String accountNumber, double annualInterestRate, double minimumBalance, double penaltyAmount) {
		super(accountNumber, annualInterestRate);
		this.minimumBalance = minimumBalance;
		this.penaltyAmount = penaltyAmount;
	}

	public double getMinimumBalance() {
		return this.minimumBalance;
	}

	public double getPenaltyAmount() {
		return this.penaltyAmount;
	}

	@Override
	public void applyMonthlyUpdate() {
		super.applyMonthlyUpdate();
		if (this.getBalance() < this.minimumBalance) {
			super.setBalance(this.getBalance() - this.penaltyAmount);
		}
	}
}
