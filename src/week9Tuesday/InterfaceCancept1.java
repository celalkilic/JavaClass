package week9Tuesday;

interface Interface2{
	int a = 90;
	// No concrete method except default static
	// abstract method
	// Global variables
	// No constructor
	// Can not be instantiated
	void abstractMethod();
	default void defaultMethod2(){ // default method doesn't need to be overridden by subclass
		System.out.println("Default method");
	}
}
class Subclass implements Interface2{
	@Override
	public void abstractMethod() {
		System.out.println("Abstract method implementation in subclass");
		
	}
	
}
public class InterfaceCancept1 {

	public static void main(String[] args) {
		Interface2 ref;
		ref = new Subclass();
		ref.abstractMethod();
		System.out.println(ref.a);

	}

}
