package week7thursday;

import week8thursday.classroom;

class Teacher{
	String name;
	int ID;
	public Teacher(String name, int iD) {
		this.name = name;
		ID = iD;
	}
	
}
class Student{
	String name;
	int ID;
	public Student(String name, int iD) {
		this.name = name;
		ID = iD;
	}
	
}
class ClassRoom{
	Student student;
	Teacher teacher;
	public ClassRoom(Student student, Teacher teacher) {
		this.student = student;
		this.teacher = teacher;
	}
	
}
public class Composition3 {

	public static void main(String[] args) {
		//1.
		ClassRoom obj = new ClassRoom(new Student("celal",629),new Teacher("dursun ali", 123));
		System.out.println(obj.student.name);
		System.out.println(obj.teacher.ID);
		
		//2.
		Student student = new Student("fatih",32);
		Teacher teacher = new Teacher("ahmet", 23);
		ClassRoom obj2 =new ClassRoom(student, teacher);
		System.out.print(obj2.student.name);
		System.out.println(obj2.student.ID);
	}

}
