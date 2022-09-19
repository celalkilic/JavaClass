package week7wednesday;
class parent{
	public void method() {
		System.out.println("this is a parent class");
	}
}
class child extends parent{
	public void method() {
		System.out.println("this is a child class");
	}
}
public class Question1 {

	public static void main(String[] args) {
		parent obj = new child();
		obj.method();
		child obj2 = new child();
		obj2.method();
	}

}
