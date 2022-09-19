package week7Tuesday;
class A3{
	public A3() {
		System.out.println("A3");
	}
}
class B3 extends A3{
	public B3() {
		System.out.println("B3");
	}
}
class C3 extends B3{
	public C3() {
		System.out.println("C3");
	}
}
public class Controcture {

	public static void main(String[] args) {
		C3 ref = new C3();

	}

}
