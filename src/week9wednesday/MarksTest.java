package week9wednesday;

public class MarksTest {

	public static void main(String[] args) {
		Marks student1 = new classA(75, 80, 90);
		System.out.println(student1.getPercentage());

		Marks student2 = new classB(90, 60, 65, 85);
		System.out.println(student2.getPercentage());

	}

}
