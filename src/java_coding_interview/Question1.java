package java_coding_interview;

public class Question1 {

	public static void main(String[] args) {
		// swap the numbers
		int a = 90;
		int b = 9;
		// a = 90 , b = 9 after swapping a = 9 , b = 90
		int temp;
		temp = a; // temp = 90 a = 90 , b = 9
		a = b;    // temp = 90 a = 9 , b = 9
		b = temp; 
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
