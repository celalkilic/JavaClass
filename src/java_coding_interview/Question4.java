package java_coding_interview;

public class Question4 {

	public static void main(String[] args) {
		// swap values
		boolean value1 = false;
		boolean value2 = true;
		
		boolean temp;
		temp = value1;
		value1 = value2; 
		value2 = temp;
		System.out.println(value1);
		System.out.println(value2);

	}

}
