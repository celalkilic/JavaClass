package week4Tuesday;

public class dowhile {

	public static void main(String[] args) {
		int i = 10;
		do {
		System.out.println(i);
		i--;
		} while (i>0);
		System.out.println();
		System.out.println("Reverse array");
		int[] arr = { 3, 43, 12, 131, 40 };
		// last element
		int j = arr.length - 1;
		do {
			System.out.print(arr[j] + " ");
			j--;
		} while (j >= 0);
	}

}
