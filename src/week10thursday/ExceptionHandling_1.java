package week10thursday;

public class ExceptionHandling_1 {

	public static void main(String[] args) {
		System.out.println("hello world");
		try {
			System.out.println(9/0);
		} catch (Exception e) {
			System.out.println("undefined");
		}
		
		System.out.println("hello world again");

	}

}
