package week4Tuesday;


public class officehour4 {

	public static void main(String[] args) {
		reversestring("silicone laps");
		System.out.println(reversestring2("silicone laps"));
	}
	static void reversestring(String str) {
		for (int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	static String reversestring2(String str) {
		String reversed = " ";
		for (int i = str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}
}
