package week10thursday;

public class ExceptionHandling_2 {

	public static void main(String[] args) {
		String string = "java";
		
		try {
			System.out.println(string.charAt(10));
		} catch (Exception e) {
			System.out.println("exception handled");
			
		}
		System.out.println("this is the rest of the code");

	}

}
