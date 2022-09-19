package week7thursday;
//inheritance : property sharing of super class with subclass.
/*OOP:
 *+ inheritance
 *+ encapsulation
 *+ polymorphism
 *+ abstraction
*/
class parent {
	int a;
	void Method (){
		System.out.println(1);
	}
}
class child{
	void Method (){
		System.out.println(2);
	}
}
public class Overview {

	public static void main(String[] args) {
		new parent().Method();
		new child().Method();

	}

}
