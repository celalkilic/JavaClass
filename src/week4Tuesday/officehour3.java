package week4Tuesday;

public class officehour3 {

	public static void main(String[] args) {
		sumOfdigitnumbers(888);
		System.out.println(sumOfdigitnumbers2(888));
	
	}
	static void sumOfdigitnumbers(int num) {
		int add=0;
		while (num!=0) {
			int reminder = num%10;
			add+=reminder;
			num /= 10;
		}
		System.out.println(add);
	}
	static int sumOfdigitnumbers2(int num) {
		int add=0;
		while (num!=0) {
			int reminder = num%10;
			add+=reminder;
			num /= 10;
		}
		return add;
	}
}
