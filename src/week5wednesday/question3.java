package week5wednesday;

public class question3 {

	public static void main(String[] args) {
		System.out.println(spaceOut("hello"));
		System.out.println(spaceOut("technology"));
	}
	static String spaceOut(String s) {
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			newStr += s.charAt(i)+" ";
		}
		return newStr;
	}

}
