package week9wednesday;

public class SavingAccount extends Account {

	public SavingAccount(String name, double initialDeposit) {
		super(name, initialDeposit);
		if (initialDeposit >= 10000) {
			balance = initialDeposit + 200;
		}
	}

	@Override
	public boolean withdraw(double amount) {
		if (balance - amount > 10) {
			balance -= amount - 2;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	public double addInterest(double rate) {
		double interest = balance * rate / 100;
		balance += interest;
		return interest;
	}

}