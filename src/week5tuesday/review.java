package week5tuesday;

public class review {

	public static void main(String[] args) {
		Class1.message2();
		Class1 ref = new Class1();
		ref.message(10, "hello");
		int a = ref.message(10, "hello");
		System.out.println(a);
	}

}
class Class1{
	int message(int x , String message) {
		System.out.println("this message is "+ message);
		return x ;
	}
	static void message2() {
		System.out.println("this is static method ");
	}
}