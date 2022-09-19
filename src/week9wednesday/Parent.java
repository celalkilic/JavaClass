package week9wednesday;

public abstract class Parent {
	
	abstract void message();
	
	// private -> default -> protected -> public
	
}

class Child1 extends Parent {

	@Override
	void message() {
		System.out.println("This is first class");
	}
	
}

class Child2 extends Parent{
	
	void message() {
		System.out.println("This is second class");
	}
	
}


	
