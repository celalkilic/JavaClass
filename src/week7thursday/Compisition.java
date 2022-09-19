package week7thursday;
class A{
	int a = 4298;
	String name = "celal";
}
public class Compisition {
	//Having a field of other classes reference
	A aObject = new A();

	public static void main(String[] args) {
	
		Compisition compobject = new Compisition();
		System.out.println(compobject.aObject.a);
		
		
		
		

	}

}
