package week9Tuesday;
interface Interface{
	// Interface can have abstract method, but not concrete method(method with body)
	// After Java 8 : Interface can have default and static method
	// We can not instantiate interface
	int a=9; // final, static and public by default
	void method(); // Abstract Method are public and abstract by default
	static void method1(){
		
	}
	
	default void method2(){ // If we want to implement the method in interface
		//, we can create default method
		
	}
	
	
}
abstract class AbstractClass{
	// We can not instantiate the abstract classes
	// We can create abstract methods
	// If abstract class have concrete subclass, subclass needs to implement all superclass
	// abstract methods
	
}
public class ConcreteClass { // Normal Class : Concrete Class
	
}

