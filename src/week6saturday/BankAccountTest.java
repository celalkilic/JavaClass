package week6saturday;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		account.withdrawMoney(200);
		System.out.println(account.balance);

	}

}
