package week6wednesday;

public class Question4 {

	public static void main(String[] args) {
		Rectangle ref1 = new Rectangle(12, 14);
		System.out.println(ref1.getArea());
		System.out.println(ref1.getPrimeter());

	}

}
class Rectangle{
	int length;
	int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	int getPrimeter() {
		return 2*(width+length);
	}
	int getArea() {
		return width*length;
	}
	
}
