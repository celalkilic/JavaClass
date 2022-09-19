package week9wednesday;

public class BankTest {

	public static void main(String[] args) {
		Bank account1 = new BankA();
		account1.depositMoney(2000);
		System.out.println("Account1 balance : " + account1.getBalance());

		Bank account2 = new BankB();
		account2.depositMoney(1000);
		System.out.println("Account1 balance : " + account2.getBalance());

		Bank account3 = new BankB();
		account3.depositMoney(3000);
		System.out.println("Account1 balance : " + account3.getBalance());

	}

}
