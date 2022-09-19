package week5monday;

public class array {

	public static void main(String[] args) {
		System.out.println(bothEven(8,6)); //should be true
		System.out.println(bothEven(5,6)); //should be false

	
	}
	public static boolean bothEven(int num1, int num2)
	{
		return (num1%2==0 && num2%2==0)?true:false;
	}
}
