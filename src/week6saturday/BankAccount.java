package week6saturday;

public class BankAccount {
	public String accountNumber;
	public double balance;
	public String customerName;
	public String phoneNumber;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void depositMoney(double depositAmount) {
		balance += depositAmount;
	}

	public void withdrawMoney(double withdrawAmount) {
		if (withdrawAmount > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance -= withdrawAmount;
		}
	}
}	
	