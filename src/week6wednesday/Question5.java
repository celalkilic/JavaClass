package week6wednesday;

public class Question5 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("john", 400, 40);
		emp1.AddSalary();
		emp1.AddWork();
		emp1.getInfo();

	}

}
class Employee{
	String name;
	int salary;
	int workHours;
	public Employee(String name, int salary, int workHours) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
	}
	
	void getInfo() {
		System.out.println("name :"+name
				+"\nsalary :"+salary
				+"\nworkHours :"+workHours);
	}
	void AddSalary() {
		if (salary<500) {
			salary+=10;
		}else {
			System.out.println("no promosion");
		}
	}
	void AddWork() {
		if (workHours>6) {
			salary+= 5;
			System.out.println("salary was increased");
		}
	}
}