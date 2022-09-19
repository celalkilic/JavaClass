package oca_certification;

import java.util.Arrays;
import java.util.Scanner;

public class Q_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir cumle giriniz lutfen"); 
		String sentence =input.nextLine(); 
		String reversed = ""; 
		String[] string1 = sentence.split(" ");
		for (int i = string1.length - 1; i >= 0; i--) { 
			if (i == string1.length - 1) { 
				reversed += string1[i]; 
				continue; 
				} 
				reversed += " " +string1[i]; 
			}
		System.out.println(reversed);
		
		String str  = "celal kilicarslan ktu ogrenci isleri";
		String reverse = " ";
		String string [] =str.split(" ");
		System.out.println(Arrays.toString(string));
		for (int i = string.length - 1; i >=0; i--) {
			if (i==string.length - 1) {
				reverse += string[i];
				continue;
			}
			reverse += " " + string[i];
			
		}
		System.out.println(reverse.trim());

	}

}
