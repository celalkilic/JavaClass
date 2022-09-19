package week6wednesday;

public class Review1 {

	public static void main(String[] args) {
		Club member1 = new Club("John", 101, 25, 'M', 2);
		member1.yearlyCalculator();
		member1.printBalance();
		member1.monthlyPayment();
		member1.printBalance();

	}

}
class Club {

	String memberName;
	int memberNo;
	int age;
	char gender;
	int membershipFee;
	int year;
	double statementBalance = 200;

	public Club() {
		
	}
	
	public Club(String memberName, int memberNo, int age, char gender, int year) {
		this.memberName = memberName;
		this.memberNo = memberNo;
		this.age = age;
		this.gender = gender;
		this.year = year;
	}
	
	int feeCalculator() {
		if (age > 18 && age <= 25) {
			return membershipFee = 30;
		}else if (age > 25 && age <= 40) {
			return membershipFee = 20;
		}else if (age > 40 && age <= 60) {
			return membershipFee = 10;
		}else {
			System.out.println("You can't be a member");
			return 0 ;
		}
	}
	
	void monthlyPayment() {
		if (statementBalance > 0) {
			statementBalance -= feeCalculator();
		}
	}
	
	void yearlyCalculator() {
		if (year == 1) {
			statementBalance -= (statementBalance * 0.1);
		}else if (year == 2) {
			statementBalance -= (statementBalance * 0.2);
		}else if (year == 3) {
			statementBalance -= (statementBalance * 0.3);
		}
	}
	
	void printBalance() {
		System.out.println("Current Balance : " + statementBalance);
	}
	
}