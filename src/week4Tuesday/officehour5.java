package week4Tuesday;

public class officehour5 {

	public static void main(String[] args) {
		int [ ] art = {1,2,3,4,5,6,7,8,9,2,2,1,5};
		findDonicatenumber(art);

	}
	static void findDonicatenumber(int [] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.print(arr[i]+ " ,");
				}
			}
		}
	}
}
