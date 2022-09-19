package week2Thursday;

import java.util.Arrays;
import java.util.Scanner;

public class classwork {

	public static void main(String[] args) {
		/*
		 * 1)Create an array of numbers, and print only the ones which is divisible by3. 
		 * 2)Create an String array and print uppercase of the strings 
		 * 3)Create an String array and get the values from the user. Then print only if the String
		 * ends with letter ‘a’. 
		 * 4)Create an int array and get the values from the user.
		 * Print the even numbers.
		 1 cozum
		 */
		/*1.qouestion
		int[] numarray = { 1,2,3,4,5,6,7,8,9 };
		 for (int i = 0; i < numarray.length; i++)
		 {
		     if (numarray[i] % 3 == 0)
		     {
		    	 System.out.println(numarray[i]);  
		     }
		     */
		//2question
		String [ ] arr2 = {"manchester","the united kingdom"};
		Object [] uppor = {arr2[0].toUpperCase(),arr2[1].toUpperCase()};
		System.out.println(Arrays.toString(uppor));
		
		//3.question
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter all names :");
		String [ ]name = {scanner.next(),scanner.next(),scanner.next(),scanner.next()}; 
		System.out.println("*******************************");
		for (int j = 0; j < name.length; j++) {
			if (name[j].endsWith("a")) {
				
				System.out.println(name[j]);
			}
		}
		//4.question
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]%2==0) {
				System.out.println(numbers[i]);
			}
		
		}
	}
}
