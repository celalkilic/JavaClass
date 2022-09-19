package week5monday;

import java.util.Arrays;

public class question1 {

	public static void main(String[] args) {
		String sentence = "silicone labs";
		String [] words = sentence.split(" ");
		System.out.println(Arrays.toString(words));
		String reversedSnt = "";
		for (int i = 0; i < words.length; i++) {
			String str = words[i];
			System.out.println(str);
			String reversedwords = "";
			for (int j = str.length()-1; j >=0; j--) {
				reversedwords +=str.charAt(j);
			}
			reversedSnt +=reversedwords + " ";
		}
		System.out.println(reversedSnt);
	}

}
