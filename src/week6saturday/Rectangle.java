package week6saturday;

public class Rectangle {

	public double Area(double width, double length) {
		return width*length;
	}
	public double perimeter(double width, double length) {
		return 2*(width+length);
	}
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.Area(10, 20));
		System.out.println(rectangle.perimeter(50, 40));
	}

}
