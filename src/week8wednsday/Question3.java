package week8wednsday;
class SavingsAccount{
	private static double annuallInterestRate;
    private double savingsBalance;
    private double monthlyInterest;
    
    public SavingsAccount( int savingsBalance) {
        this.savingsBalance = savingsBalance;
    } 
    public void calculateMonthlyInterest() {
        this.monthlyInterest = (savingsBalance * annuallInterestRate) / 12;
        System.out.println("The monthly interest is : " + this.monthlyInterest);
    }
    public static void modifyInterestRate(Double interestRate) {
        annuallInterestRate = interestRate;
    }
    private void calculateSavings() {
        savingsBalance += this.monthlyInterest;
    }
    public void displaySavings() {
        calculateSavings();
        System.out.println("The total balance is : $ " + savingsBalance);
    }
}
public class Question3 {

	public static void main(String[] args) {
		SavingsAccount saver1=new SavingsAccount(45000);
	    SavingsAccount saver2=new SavingsAccount(70000);
	    SavingsAccount.modifyInterestRate(2.1);

	       saver1.calculateMonthlyInterest();
	       saver2.calculateMonthlyInterest();
	       saver1.displaySavings();
	       saver2.displaySavings();
	       SavingsAccount.modifyInterestRate(3.2);
	       saver1.calculateMonthlyInterest();
	       saver2.calculateMonthlyInterest();
	       saver1.displaySavings();
	       saver2.displaySavings();
	}

}
