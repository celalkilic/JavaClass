package week8thursday;
abstract class Shape{
	abstract void findArea(); 
}
class Square extends Shape{
	int side;
	public Square(int side) {
		this.side = side;
	}
	void findArea() {
		System.out.println(side*side);
	}
}
class Rectangle extends Shape{
	int length;
	int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	@Override
	void findArea() {
		System.out.println(length*width);
		
	}
}

public class AbstractConcept2 {

	public static void main(String[] args) {
		Shape ref, ref2;
		ref = new Square(4);
		ref2 = new Rectangle(3,5);
		
		ref.findArea();
		ref2.findArea();
		
		

	}

}
