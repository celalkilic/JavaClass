package week5wednesday;

public class question5 {

	public static void main(String[] args) {
		System.out.println(uniqueChars("spoon"));
		System.out.println(uniqueChars("java"));
	}
	static String uniqueChars(String str) {
		String newString = "";
		for (int i = 0; i < str.length(); i++) {		
			if (!newString.contains(str.substring(i, i+1))) {
				newString += str.substring(i, i+1);
			}		
		}
		return newString;
	}
}
