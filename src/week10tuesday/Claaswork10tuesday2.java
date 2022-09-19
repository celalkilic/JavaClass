package week10tuesday;

@FunctionalInterface
interface IPalindrome{
	boolean isPalindrome(String s);
}
public class Claaswork10tuesday2 {
	public static void main(String[] args) {
		IPalindrome refIPalindrome  = (String s) -> {	
			 int i = 0, j = s.length() - 1;  
		        while (i < j) {      
		            if (s.charAt(i) != s.charAt(j)) 
		                return false;
		            i++; 
		            j--; 
		        }       
		        return true; 
		    }; 
		    System.out.println(refIPalindrome.isPalindrome("adda"));
		    System.out.println(refIPalindrome.isPalindrome("dfersa"));
	}
}
