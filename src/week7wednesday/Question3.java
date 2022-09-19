package week7wednesday;

class Rectangle{
	int length;
	int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public void Area() {
		System.out.println("area :" + length*width);
	}
	public void Perimeter() {
		System.out.println("Perimeter :" + 2*(length+width));
	}
}
class Square extends Rectangle{
	int s;

	public Square(int s) {
		super(s, s);
	}
	
}
public class Question3 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(50, 20);
		rectangle.Area();
		rectangle.Perimeter();
		Square square = new Square(12);
		square.Area();
		square.Perimeter();
	}

}
