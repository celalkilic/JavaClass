package week4Tuesday;

import java.util.Scanner;



public class oopexercise {

	public static void main(String[] args) {
		/*
		 * for (int i = 1; i < 4; i++) { for (int j = 1; j < i + 1; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 * 
		 * for(int k = 4; k > 1; k--) { for(int l = 1; l < k - 1; l++){
		 * System.out.print("#"); } System.out.println(); }
		 */
	    
		/*
		 * String name = "Timmy"; System.out.println(name.length()); String str =
		 * "boopity bop"; int i = 10; System.out.println(str.charAt(5));
		 * System.out.println(str.charAt(8)); System.out.println(str.charAt(i)); String
		 * strr = "abracadabra alakazam"; String target1 = "dab"; String target2 =
		 * "ABRA"; String upperString = strr.toUpperCase();
		 * System.out.print(strr.indexOf("c")); System.out.print(strr.indexOf(" "));
		 * System.out.print(strr.indexOf(target1));
		 * System.out.print(upperString.indexOf(target2)); 
		 */
		/*
		 * String str ="laptops out for harambe"; //write code below
		 * System.out.println(str.substring(5,str.length()-1));
		 * System.out.println(str.substring(7,10));
		 * System.out.println(str.substring(16,str.length()-1));
		 * System.out.println(str.substring(10, 12));
		 */
		/*
		 * Scanner inp = new Scanner(System.in); System.out.print("In:"); String str =
		 * inp.nextLine(); System.out.print("Start:"); int start = inp.nextInt(); start=
		 * 2; System.out.print("End:"); int end = inp.nextInt(); end = 4; // Don't
		 * change the code above! Write your code below
		 * System.out.println("The substring of"+ " "+ str+ " "+"from"+" " +start+" "+
		 * "to"+ " "+end+" "+ "inclusive is"+" "+ str.substring(start, end+1));
		 */
		/*
		 * Scanner inp = new Scanner(System.in); System.out.print("In:"); int num =
		 * inp.nextInt();
		 */
		/*
		 * The variable "num" holds an integer user input Write a conditional statement
		 * starting on line 9 that does the following: 
		 * If num is positive, 
		 * print	"__ is positive" 
		 * If num is negative, print "__ is negative" 
		 * Examples: In: 5 
		 * 5 is positive 
		 * In: -2 
		 * -2 is negative 
		 * In: 0
		 */
		
		/*
		 * if (num>0) { System.out.println(num+" "+"is positive "); }else if (num<0) {
		 * System.out.println(num+" "+"is negative "); }else { System.out.println(num);
		 * }
		 */
		/*
		 * Scanner inp = new Scanner(System.in); System.out.print("In:"); String name =
		 * inp.nextLine();
		 * 
		 * if (name.equals("chen")) { System.out.println("teacher"); }else {
		 * System.out.println("student"); }
		 */
		/*
		 * For you to do:
		 * 
		 * Given a string variable "word", do the following tests
		 * 
		 * If the word ends in "y", print "-ies" 
		 * If the word ends in "ey", print "-eys"
		 * If the word ends in "ife", print "-ives" If none of the above is true, print
		 * "-s" No more than one should be printed.
		 */
		/*
		 * Scanner inp = new Scanner(System.in); System.out.print("In:"); String word =
		 * inp.nextLine(); //DO NOT CHANGE ABOVE CODE! Write your code below if
		 * (word.endsWith("ey")) { System.out.println("-eys"); }else if
		 * (word.endsWith("y")) { System.out.println("-ies"); }else if
		 * (word.endsWith("ife")) { System.out.println("-ives"); }else {
		 * System.out.println("-s"); }
		 */
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int end = inp.nextInt();
	    //write your code below
	    for(int i = 1; i <= end; i++)
		{
			System.out.println(i);
			
		}*/
		 /*Scanner inp = new Scanner(System.in);
		 System.out.print("In:");
		 String word = inp.nextLine();
		 for (int i = 0; i < word.length(); i++) {
			 System.out.println(word.charAt(i));
		}*/
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    for (int i = 0; i < word.length(); i++) {
			if (i%2!=0) {
				System.out.print("");
			}else {
				System.out.print(word.charAt(i));
			}
		}*/
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    char [ ] vowel = {'e','u','i','o','a'};
	    for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowel.length; j++) {
				if (word.charAt(i)==vowel[j]) {
					System.out.print("");
			System.out.print(word.charAt(i));
				}
			}
			
		}
		*/
		 /*Scanner inp = new Scanner(System.in);
		 System.out.print("In:");
		 double max = inp.nextDouble();
		 int sw = 0;
		 if(max==1||max==2) {
			 System.out.println(max==2?"Prime":"not Prime");
		         }else if(max%2==0) {
		            System.out.println("not Prime");
		        }else {
		            for(int i=3;i<=Math.sqrt(max);i++) {
		                if(max%i==0) {
		                    sw=1;
		                }      
		            }
		            if(sw==1) {
		                System.out.println("not Prime");
		            }
		            else {
		                System.out.println("Prime");
		            
		        }
		    }*/
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	    //write your code below
	    for (int i = 0; i < x; i++) {
	    	System.out.println(i);
			
		}
		*/
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	    //write your code below
	    for (int i = 0; i < x; i+=3) {
			System.out.println(i);
		}
		*/
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	    //write your code below
	    for (int j =x-1; j >=0; j--) {
			System.out.println(j);
		}*/
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	    //write your code below
	    String str = "AP CS A";
	    for (int i = 0; i < x; i++) {
	    	System.out.println(str);
		}*/
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i)+" ");
		}*/
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}*/
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    for (int i = 0; i < s.length(); i++) {
	    	 System.out.print(i%2==0?s.substring(i,i+1).toLowerCase():s.substring(i,i+1).toUpperCase());
		}*/
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	   	//write your code below
		
		
		for(int i=0;i<x;i++) {
			System.out.print(Fibonacci(i)+" ");
	        }
	    }
	     public static int Fibonacci(int n) {  
	         if(n==0){
	             return 0;
	         }
	         else if(n <= 2) 
	             return 1;
	         else
	             return Fibonacci(n-1) + Fibonacci(n-2);
	     */
		/*Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	   	//write your code below
	    
	    s = s.replace(" ", "");
	    String reverseword = "";
	    for (int i = s.length()-1;i>=0; i--) {
			reverseword +=s.charAt(i);
		}
	    System.out.println(reverseword.equalsIgnoreCase(s));
	 */
		/*Scanner s = new Scanner(System.in);
	    System.out.print("#1: ");
	    int num1 = s.nextInt();
	    System.out.print("#2: ");
	    int num2 = s.nextInt();
	    //start on line 11
	    int cnt = num1;
	    if (num1%2==0) {
	    	cnt +=1;
	    }
	    	while (cnt<=num2) {
	    		System.out.print(cnt+ " ");
				cnt +=2; 
			
		}*/
		/*Scanner s = new Scanner(System.in);
	    System.out.print("#1: ");
	    int num1 = s.nextInt();
	    System.out.print("#2: ");
	    int num2 = s.nextInt();
	    //start on line 11
	    int cnt=num1;
        int sum=0;
        if(num1%2==0) {
        	cnt+=1;}
        while(cnt<=num2) {
            sum+=cnt;
            cnt+=2;   
            System.out.print(cnt+ " ");
      }
        
        System.out.println(sum);
        */
		
	}	
		
}
