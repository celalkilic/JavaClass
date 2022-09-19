package java_coding_interview;

public class Question5 {

	public static void main(String[] args) {
		// find the prime numbers i a data
		int number = 13;
		boolean isPrime = false;
		for (int i = 2; i <= number/2; i++) {
			if (number%i==0) {
				isPrime = true;
				break;
			}			
		}
		if (!isPrime) {
			System.out.println(number+" is a prime number");
		}else {
			System.out.println(number+" is not a prime number");
		}
	}

}
