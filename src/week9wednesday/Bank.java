package week9wednesday;

public abstract class Bank {

	abstract double getBalance();

	abstract void depositMoney(double amount);

}

class BankA extends Bank {

	private double balance;

	@Override
	double getBalance() {
		return balance;
	}

	@Override
	void depositMoney(double amount) {
		balance += amount;
	}

}

class BankB extends Bank {
	private double balance;

	@Override
	double getBalance() {
		return balance;
	}

	@Override
	void depositMoney(double amount) {
		balance += amount;
	}
}

class BankC extends Bank {

	private double balance;

	@Override
	double getBalance() {
		return balance;
	}

	@Override
	void depositMoney(double amount) {
		balance += amount;
	}


}
