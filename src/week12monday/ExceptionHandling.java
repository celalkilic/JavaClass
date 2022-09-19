package week12monday;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int num1 = 65;
			int num2 = 0;
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("handled");
		}
		

	}

}
