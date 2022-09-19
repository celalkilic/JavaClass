package week10thursday;


public class ExceptionHandling_4 {

	public static void main(String[] args) throws Exception {
		// two ways to handle exception :try-catch, throw keyword
		//throw keyword make the code compilable, but if there is a problem, exception will be throwed
		//throws keyword also warning developers that method can throw exception
		System.err.println("hello world");
		Thread.sleep(5000); // Slows the program flow by milliseconds
		method(9, 0);

	}
	static void method(int a, int b) throws Exception {
		System.out.println(a/b);
	}

}
