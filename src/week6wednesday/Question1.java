package week6wednesday;

import week8thursday.classroom;

public class Question1 {

	public static void main(String[] args) {
		Telephone tel1 = new Telephone();
		tel1.setNumber("36985477");
		System.out.println(tel1.getNumber());
		System.out.println(Telephone.quantity);
		System.out.println(Telephone.total);
	}

}
class Telephone{
	String number;
	static int quantity = 250;
	static double total = 15658.92;
	
	String getNumber() {
		return number;
	}
	void setNumber(String number) {
		this.number = number;
		
	}
}
