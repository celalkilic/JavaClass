package week4Tuesday;

public class forLooprecap {

	public static void main(String[] args) {
		// write a code to calculate sum of all numbers between 1 and 5
		int sum = 0;
		for (int i = 0; i <= 5; i++) {
			sum = sum+i;		
		}
		System.out.println(sum);
		
		// Create a for loop between 5 to 100
				// print all the elements
				// increase the value by 10
				// 5 - 15 - 25 - ... - 105
				
				for (int i = 5; i <= 105; i += 10) {
					System.out.println(i);
				}
		String word = "silicone laps";
		String reverse = "";
		for (int i = word.length()-1; i >=0; i--) {
			reverse+=word.charAt(i);
			
		}
		System.out.println(reverse);
		
	}

}
