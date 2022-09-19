package week7thursday;
//this Keyword : working like a reference for the current class
//1)call current class field
//2)call current class method
//3)call current class constructor
class SubClass3 {
	int a = 4298;
	
	public SubClass3(int a) {
		this.a = a;
	}
	public SubClass3 () {
		this(4000);
	}	
	void method(int a) {
		System.out.println(a + this.a);
	}
	void method2() {
		this.method(9);
		method(8);
	}
	
}
public class ThisKeyword {

	public static void main(String[] args) {
		new SubClass3().method(9);
		System.out.println(new SubClass3().a);

	}

}
