package week6wednesday;

public class Question2 {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "john";
		student.roll_no = 12;
		student.studentInfo();

	}

	
}
class Student{
	String name;
	int roll_no;
	void studentInfo() {
		System.out.println("student number : "+ roll_no);
		System.out.println("student name : "+ name);
	}
}
