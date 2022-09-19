package week5wednesday;

public class question4 {

	public static void main(String[] args) {
		System.out.println(cencorLetter("computer science", 'e'));

	}
	static String cencorLetter(String s, char ch) {
		s = s.replace(ch, '*');
		return s;
	}
}
