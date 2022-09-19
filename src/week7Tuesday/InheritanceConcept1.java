package week7Tuesday;
//1) Inheritance only works one way, properties won't be inherited from
//from subclass to superclass
//2) Private properties won't be inherited by subclass
class SuperClass{ // Parent Class
	int a;
	private String bString;
	void SCMethod(){
		System.out.println("Super class method");
	}
}
class SubClass extends SuperClass{ // Child Class
	int c;
}
public class InheritanceConcept1 {

	public static void main(String[] args) {
		new SubClass().SCMethod();
		new SuperClass().SCMethod();

	}

}
