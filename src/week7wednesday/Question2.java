package week7wednesday;
class Member {

	String name;
	int age;
	String phone;
	String address;
	int salary;
	
	public Member(String name, int age, String phone, String address, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
	}
	
	public Member() {
		System.out.println("defult constructor");
	}

	public void printSalary() {
		System.out.println(name + " has a salary of " + salary);
	}
}

class Employee extends Member {
	
	String specialization;
	public Employee(String name,int age, String phone,String address,int salary, String specialization) {
		super(name, age, phone, address, salary);
		this.specialization = specialization;
	}
}

class Manager extends Member {
	
	String department;

	public Manager(String name, int age, String phone, String address, int salary, String department) {
		super(name, age, phone, address, salary);
		this.department = department;
	}
		
}

public class Question2 {

	public static void main(String[] args) {
		Employee john = new Employee("John",30,"312312313","California",5000,"Cyber Security");
		
		john.printSalary();
		
		Manager tim = new Manager("Tim",35,"312332323","California",7000,"IT Department");
		
		tim.printSalary();

	}

}
