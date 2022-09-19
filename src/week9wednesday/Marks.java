package week9wednesday;

public abstract class Marks {

	abstract double getPercentage();

}

class classA extends Marks {

	private double results;

	public classA(double sub1, double sub2, double sub3) {
		results = (sub1 + sub2 + sub3) / 3;
	}

	@Override
	double getPercentage() {
		return results;
	}

}

class classB extends Marks {
	private double results;

	public classB(double sub1, double sub2, double sub3, double sub4) {
		results = (sub1 + sub2 + sub3 + sub4) / 4;
	}
	double getPercentage() {
		return results;
	}
}
