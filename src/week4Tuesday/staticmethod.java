package week4Tuesday;

import java.util.Scanner;

public class staticmethod {

	public static void main(String[] args) {
		reversestring("elam");
		String word2 = reversesString2("ahmet");
		System.out.println(word2);
		System.out.println("please enter your miles: ");
		double miles = new Scanner(System.in).nextDouble();
		double km = milestokilometer(miles);
		System.out.println(km);
	}
	static void reversestring(String word) {
		for (int i = word.length()-1;i>=0; i--) {
			System.out.print(word.charAt(i));
		}
	}
	static String reversesString2(String word) {
		String reverseword = " ";
		for (int i = word.length()-1;i>=0; i--) {
			reverseword+=word.charAt(i);
		}	
		return reverseword;
	}
	static double milestokilometer(double miles) {
		return miles*1.6;
		
	}
}
