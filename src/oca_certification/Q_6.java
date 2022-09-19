package oca_certification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q_6 {

	public static void main(String[] args) {
		// what is the largest number among three numbers
		int a = 19, b = 29, c = 39;
		
		if (a>b&&b>c) {
			System.out.println("the largest number is : "+ a);
		}else if (b>a&&b>c) {
			System.out.println("the largest number is : "+ b);
		}else {
			System.out.println("the largest number is : "+ c);
		}
		// 2) Collections
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(a,b,c));
		System.out.println(Collections.max(arr));
		
	}

}
