package week7Tuesday;
class shape{
	void FindArea() {
		System.out.println("finding the area");
	}
	
}
class Ractangle extends shape{
	void method() {
		this.FindArea();
		super.FindArea();
	}
	void FindArea() {
		System.out.println("finding the area of the Ractangle");
	}
}
class Cirlcle extends shape{
	void FindArea() {
		System.out.println("finding the area of the Cirlcle");
	}
}
public class InheritanceConceptOverriding2 {

	public static void main(String[] args) {
		Cirlcle cirlcle = new Cirlcle();
		Ractangle ractangle = new Ractangle();
		shape shape = new shape();
		
		cirlcle.FindArea();
		ractangle.FindArea();
		shape.FindArea();
		new Ractangle().method();
	}

}
