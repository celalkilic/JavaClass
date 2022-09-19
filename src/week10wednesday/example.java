package week10wednesday;

@FunctionalInterface
interface Mathematics {

	void operation(int num1, int num2);
	
}

public class example {

	public static void main(String[] args) {
		Mathematics subtraction = (num1, num2) -> System.out.println("Subtraction: " + (num1 - num2));
		subtraction.operation(20, 10);
		
		Mathematics addition = (num1, num2) -> System.out.println("Addition: " + (num1 + num2));
		addition.operation(30, 15);
		
		Mathematics division = (num1, num2) -> System.out.println("Division: " + (num1 / num2));
		division.operation(25, 5);
		
		// parameter -> implemented code
	}

}