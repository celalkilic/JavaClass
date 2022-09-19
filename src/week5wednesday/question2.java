package week5wednesday;

import java.util.Arrays;

public class question2 {

	public static void main(String[] args) {
		Addtiarray(new int [] {2, 5,8,7,85},6);

	}
	static void Addtiarray(int [] arr, int number) {
		
		int [] newArray = new int[arr.length+1] ;
		for (int i = 0; i < arr.length; i++) {
			newArray[i]=arr[i];
		}
		newArray[arr.length] = number;
		System.out.println(Arrays.toString(newArray));
	}
	
}
