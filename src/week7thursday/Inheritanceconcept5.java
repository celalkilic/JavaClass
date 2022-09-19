package week7thursday;
class SuperClass1{
	int a;
	public SuperClass1(int a) {
		System.out.println("1");
		this.a= a;
	}
	public SuperClass1() {
		System.out.println("2");
	}
}
class SubClass1 extends SuperClass1{
	int b;
	public SubClass1() {
		System.out.println("3");
	}
		SubClass1(int b) {
		super(b);
		System.out.println("4");
	}	
	
}
public class Inheritanceconcept5 {

	public static void main(String[] args) {
		//new SubClass1(9);
		//new SubClass1();
		//new SuperClass1(3);
		new SuperClass1();

	}

}
