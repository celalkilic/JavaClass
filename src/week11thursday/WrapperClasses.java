package week11thursday;

public class WrapperClasses {

	public static void main(String[] args) {
		// Wrapper Classes are non primitive version of primitive data types
		
		// Primitive data types
		// int, double, float, byte, short, long, char, boolean
		
		
		// Wrapper Classes
		// Number -> Integer, Double, Float, Byte... 
		
		Integer integer = 9;
		
		System.out.println(integer + 10);
		
		Double double1 = 90.8;
		Float float1 = 88.8f;
		
		// Number is superclass of Double and Float, That’s why we can pass subclass objects to this method
		show(double1, float1);
	}
	static void show(Number n1 , Number n2){
		System.out.println(n1);
		System.out.println(n2);

	}

}
