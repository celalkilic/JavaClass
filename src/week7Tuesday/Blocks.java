package week7Tuesday;

class A{
	{
		System.out.println(1);
	}
}
class B extends A{
	{
		System.out.println(2);
	}
}
class C extends B{
	{
		System.out.println(3);
	}
}
public class Blocks {

	public static void main(String[] args) {
		C ref = new C();
		System.out.println("***********");
		B REF2 = new B();
		System.out.println("***********");
		A REF3 = new A();
		

	}

}
