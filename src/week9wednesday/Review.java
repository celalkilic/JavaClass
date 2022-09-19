package week9wednesday;

class ReviewA{
	void method() {
		System.out.println("parent class method");
	}
}
public class Review extends ReviewA {
	@Override
	void method() {
		System.out.println("Child class method");
	}
	
	public static void main(String[] args) {
	ReviewA r = new Review();
	r.method();
	Review r1 = new Review();
	r1.method();
	ReviewA r2 = new ReviewA();
	r2.method();
	}
	
}
