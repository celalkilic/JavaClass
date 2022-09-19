package java_coding_interview;

public class Question7 {

	public static void main(String[] args) {
		// first word of the strings
		System.out.println(firstWord("hello word"));

	}
	static String firstWord(String string) {
		String first = new String(string);
		if (first.contains(" ")) {
			first = first.substring(0, first.indexOf(" "));
		}
		return first;
	}

}
