package java_coding_interview;


public class Question6 {

	public static void main(String[] args) {
		// create two methods, one will reverse the string,
		// one will reverse sentence word by word
		String string = "silicone labs";
		System.out.println(reverseStringBuilder(string));
		System.out.println(reverseStringByWord("silicone labs cel lal"));

	}
	static StringBuilder reverseStringBuilder(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder = stringBuilder.reverse();
		return stringBuilder;
	}
	
	static String reverseStringByWord(String string) {
		String [] arr = string.split(" ");
		String reversed = "";
		for (int i = arr.length-1; i >= 0; i--) {
			reversed += arr[i]+" ";
		}
		return reversed+" ";
	}
}
