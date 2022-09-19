package oca_certification;


public class Q_13 {

	public static void main(String[] args) {
		String string = reverseSentenceByWord("I want to go to california");
		System.out.println(string);

	}
	static String reverseSentenceByWord(String string) {
		String arr [] = string.split(" ");
		String reversed = "";
		for (int i = arr.length-1; i >=0; i--) {
			reversed += arr[i]+" ";
		}
		return reversed;
	}
}
