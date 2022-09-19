package week4thursday;

import week4Tuesday.MethodConcept1;

public class ClassStructure {
	// Files can contain more than one class
	// In one file there can be only one public class
	
	public static void main(String[] args) {
		// Calling static method from another class
		Second.method1();
		// Calling non-static method from another class
		Second reference = new Second();
		reference.method2();
		
		MethodConcept1 ref = new MethodConcept1();
		System.out.println(ref.findAge(1990));
	}

}

class Second{
	
	 void method2(){
		System.out.println("2");
	}
	
	 static void method1(){
		System.out.println("1");

	}

}
