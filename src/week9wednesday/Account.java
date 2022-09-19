package week9wednesday;

public abstract class Account {

	protected String name;
	protected double balance;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nBalance: " + balance;
	}

	public abstract boolean withdraw(double amount);

	public abstract void deposit(double amount);
}

