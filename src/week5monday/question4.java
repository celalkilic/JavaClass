package week5monday;

public class question4 {

	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("********************");
		int a = 1;
		while (a<=100) {
			if (a%2==0) {
				System.out.println(a + "even number");
			} else {
				System.out.println(a+ "odd number");
			}
			a++;
		}
	}

}
