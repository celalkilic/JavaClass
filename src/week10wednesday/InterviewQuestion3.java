package week10wednesday;
import java.util.Arrays;
import java.util.Iterator;

public class InterviewQuestion3 {

	public static void main(String[] args) {

		// Input = [1, 2, 3]
		// Output = [3, 2, 1]

		// Input = [4, 5, 2, 1]
		// Output = [1, 2, 5, 4]

		System.out.println(Arrays.toString(reverseArr2(new int[] { 1, 2, 3, 4 })));
		System.out.println(Arrays.toString(reverseArr2(new int[] { 4, 5, 2, 1 })));

	}

	static int[] reverseArr(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {
			int num = arr[i];
			arr[i] = arr[arr.length - i - 1]; // start from last number
			arr[arr.length - i - 1] = num;
		}

		return arr;
	}
	
	
	static int[] reverseArr2(int[] arr) {
		
		int i = 0;
		int j = arr.length;
		while(i < j) {
			
			j--;
			i++;
		}
		
		return arr;
	}

}
