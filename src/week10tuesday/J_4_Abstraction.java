package week10tuesday;

import week4thursday.NonStaticMethod1;

//we achieve abstraction with abstract classes and interfaces
abstract class AbstractContract{
	//we can not create object for abstract class
	abstract void print();
}
class Child extends AbstractContract{

	@Override
	void print() {
		System.out.println("hello");
		
	}
	
}
public class J_4_Abstraction implements IContract {

	public static void main(String[] args) {
		IContract ref = new J_4_Abstraction();
		ref.Method1();
		IContract.method2();

	}

}
interface IContract{
	//we can achieve multiple inheritance with interface
	//we can have abstract method, default method and static method
	//we override default method , but we can not override static method
	//we can not instantiate interfaces.
	default void Method1() {
		System.out.println("defult");
	}
	static void method2() {
		System.out.println("static");
	}
}
