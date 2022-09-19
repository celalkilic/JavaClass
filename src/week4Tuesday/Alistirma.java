package week4Tuesday;

import java.util.Arrays;

public class Alistirma {

	public static void main(String[] args) {
		//1String string1 = "Celal Kilicarslan";
		//String string2 = string1.toLowerCase();
		//System.out.println(string1.length());
		
		//System.out.println(string1.charAt(0));
		//System.out.println(string1.toUpperCase());
		//System.out.println(string1.toLowerCase());
		//System.out.print(string1.charAt(0));
		//System.out.println(string1.charAt(string1.length()-1));
		//System.out.print(string1.substring(0,1));
		//System.out.print(string1.substring(string1.length()-1));
		
		/*2
		 * int number = 653; int firsdigit = number/100; number = number%100; int
		 * seconddigit = number/10; int thirtdigit = number%10; int reversenumber =
		 * thirtdigit*100 + seconddigit*10+firsdigit; System.out.println(reversenumber);
		 * System.out.println(number); System.out.println(firsdigit);
		 */
		//3print out first half of the word twice
		//in java
		//out jaja
		/*4
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("bir kelime giriniz lufen:  "); String word2 =
		 * scanner.next(); int last = word2.length()/2; String firsthalf =
		 * word2.substring(0, last); System.out.println(firsthalf+firsthalf);
		 */
		/*5
		 * in lemur
		 *out m
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir kelime giriniz :");
		String word = scanner.next();
		int lenght = word.length()/2;
		System.out.println(word.substring(lenght, lenght+1));
		*/
		/*6.soru
		 * in craig_federigh@gmail.com
		 *out First name : Craig
		 *out last name: Federigh
		 *out domain : gmail
		 *out to-level domain : com
		 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("mail adresinizi giriniz : ");
		String email = scanner.next();
		int firstname = email.indexOf("_");
		int lastname = email.indexOf("@");
		int domain = email.indexOf(".");
		System.out.println("First name is :"+ email.substring(0,1).toUpperCase()+email.substring(1, firstname));
		System.out.println("last name is : "+ email.substring(firstname+1,firstname+2).toUpperCase()+ email.substring(firstname+2,lastname));
		System.out.println("domain is : "+ email.substring(lastname+1, domain));
		System.out.println("to-level domain is : "+ email.substring(domain+1));
		*/
		/*7.
		 * int key = 10; String string = "Silicone lap";
		 * 
		 * switch (key) { case 9: string = string.toLowerCase();
		 * 
		 * case 8 : string = string.toUpperCase(); case 1: string = string.substring(0,
		 * 8); default: string = string.replace('S', 'T'); break; }
		 * 
		 * System.out.println(string);
		 */
		int [] numbers = {9,4,5,6,5,7,8,9,};
		String [] pinfm = {"celal","kilicarslan","manchester"};
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(pinfm));
		int [ ] ad = new int[5];
		System.out.println(Arrays.toString(ad));
		
		
		
	}

}
