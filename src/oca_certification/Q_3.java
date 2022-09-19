package oca_certification;

import java.util.Random;

public class Q_3 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
		
		// Print random 3 values from this array
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[new Random().nextInt(10)]);
		}

	}

}
