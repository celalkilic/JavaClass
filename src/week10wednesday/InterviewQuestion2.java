package week10wednesday;

public class InterviewQuestion2 {

	public static void main(String[] args) {

//		Say the word Fizz instead of the number when it is a multiple of 3.
//		Say Buzz if it is a multiple of 5.
//		Say FizzBuzz if it is a multiple of both 3 and 5.

		System.out.println(fizzBuzz(7));
	}

	static String fizzBuzz(int number) {
		if (number % 15 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		}
		return "";
	}

}