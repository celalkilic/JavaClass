package week8tuesday;
class SuperClass{
	int a =19;
	void method() {
		System.out.println(a);
	}
	void method2() {
		System.out.println("2");
	}
} 
class SubClass extends SuperClass{
	int a = 1900;
	void method() {
		System.out.println(a);
	}
	void method3() {
		System.out.println("3");
	}
}
public class Upcasting {
//Up-casting: creating subclass object with  superclass reference 
	public static void main(String[] args) {
		SuperClass ref1 = new SuperClass();
		SubClass ref2 = new SubClass();
//Up-casting : All the fields and methods will belong the superclass
//except overridden methods : overridden methods will come from subclass
		SuperClass ref3 = new SubClass();
		System.out.println(ref1.a);//19
		System.out.println(ref2.a);//1900
		System.out.println(ref3.a);//19
		ref1.method();//19
		ref2.method();//1900
		ref3.method();//1900
		ref3.method2();
		//ref3.method3();//compiling error

	}

}
