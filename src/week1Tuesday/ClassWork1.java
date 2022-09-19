package week1Tuesday;

import java.util.Scanner;

public class ClassWork1 {

	public static void main(String[] args) {
//1.question
//Create a String named "name" and assign the value "Timmy" to it
//Print out the length of the string variable 'name'	
		String name = "Timmy";
		System.out.println(name.length());
//2.question
//Create a String named "name" and assign the value "Timmy" to it
//Print out the character in the 5th index of the String str
//Print out the character in the 8th index of the String str//Print out the character in the 1st index of the String str
		//System.out.println(name.charAt(5));
		//System.out.println(name.charAt(8));
		System.out.println(name.charAt(1));
/*3.question	
String str = "abracadabra alakazam";
String target1 = "dab";
String target2 = "ABRA";
(the output should be one per line)
	 
	Print out the position of the first occurrence of "c"
	Print out the position of the first occurrence of " "
	Print out the position of the first occurrence of the variable target1
	Print out the position of the first occurrence of the variable target2
*/
		String str = "abracadabra alakazam";
		String target1 = "dab";
		String target2 = "ABRA";
		
		System.out.println(str.indexOf('c'));
		System.out.println(str.indexOf(' '));
		System.out.println(str.indexOf(target1));
		System.out.println(str.toUpperCase().indexOf(target2));
		
/*4.question 
Take a string from user , do the following:
Print out the following: "The first 3 letters of ___ is ___"
 
For example, if the input is "banana", your output should be "The first 3 letters of banana is ban"
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a word : ");
		String enter = scanner.next();
		String a = enter.substring(0, 3);
		System.out.println("The first 3 letters of"+ " "+ enter+ " "+ "is"+" "+a);
	}

}
