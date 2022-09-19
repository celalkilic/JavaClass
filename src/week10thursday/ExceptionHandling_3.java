package week10thursday;

public class ExceptionHandling_3 {

	public static void main(String[] args) {
		String [] arr = {"java","gherkin","java"};
		
		try {
			System.out.println(arr[10]);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("string index out of bound");
			
		}
		catch (ArithmeticException e) {
			System.out.println("array index problem");
		}
		catch (Exception e) {
			System.out.println("exception");
		}

	}

}
