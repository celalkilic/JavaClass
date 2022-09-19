package week7wednesday;

import java.util.Scanner;

class Shape{
	String name;

	public Shape(String name) {
		this.name = name;
	}
	
}
class Circle extends Shape{
	double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	public void circleArea() {
		System.out.println("area of " + name+ " "+ "is" +" "+ (Math.PI*Math.pow(radius, 2)));
	}
	
}
class Rectangle2 extends Shape{
	int length;
	int width;
	public Rectangle2(String name,int length, int width) {
		super(name);
		this.length = length;
		this.width = width;
	}
	public void rectangleArea() {
		System.out.println("area of "+ name + " "+ "is"+ " "+ length*width);
	}
	public void perimeter() {
		System.out.println("perimeter of the "+ name+ " "+ "is" +" "+2*(length+width));
	}
	
}
public class Question4 {

	public static void main(String[] args) {
	while (true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("which shape do you want to enter rectangle or circle or q?");
		String shape = scanner.next();
		
		if (shape.equalsIgnoreCase("circle")) {
			System.out.println("enter your circle name");
			String name = scanner.next();
			System.out.println("enter your circle of the radius");
			double r = scanner.nextDouble();
			Circle circle = new Circle(name, r);
			circle.circleArea();
		}else if (shape.equalsIgnoreCase("rectangle")) {
			System.out.println("enter your rectangle name");
			String name = scanner.next();
			System.out.println("enter your rectangle of the length and width");
			int l = scanner.nextInt();
			int w = scanner.nextInt();
			Rectangle2 rectangle = new Rectangle2(name,l,w);
			rectangle.rectangleArea();
			rectangle.perimeter();
		}else if (shape.equalsIgnoreCase("q")) {
			break;
		}
	}
	}
	
}
