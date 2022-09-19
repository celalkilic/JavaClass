package oca_certification;

public class Q_8 {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int fibonacci = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 0; i <= 9; i++) {
			fibonacci = n1 + n2;
			System.out.print(" ");
			System.out.print(fibonacci);
			n1=n2;
			n2=fibonacci;
		}
	}

}
