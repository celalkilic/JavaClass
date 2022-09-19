package oca_certification;

public class Q_5 {

	public static void main(String[] args) {
		// Check if a character is a vowel {a,e,i,o,u} or consonant{Rest of the alphabet}
		
				char character = 'z';
				
				switch (character) {
				case 'a':
				case 'A':
				case 'e':
				case 'E': 
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					System.out.println(character + " is a vowel");
					break;
				default:
					System.out.println(character + "is a consonent");
					break;
				}
				

	}

}
