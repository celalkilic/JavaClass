package week8wednsday;

public class Questiontest1 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John", "Townley", 70000);
		Employee emp2 = new Employee("Ahmet", "Turk", 60000);
		
		System.out.println("Employee Yearly Salaries");
		System.out.println(emp1.getFirsName() + " - " + emp1.getSalary());
		System.out.println(emp2.getFirsName() + " - " + emp2.getSalary());
		
		System.out.println("Raising the salary by 10%");
		emp1.setSalary(emp1.getSalary() * 1.1);
		emp2.setSalary(emp2.getSalary() * 1.1);
		
		System.out.println("\nEmployee Yearly salaries after raise");
		System.out.println(emp1.getFirsName() + " - " + emp1.getSalary());
		System.out.println(emp2.getFirsName() + " - " + emp2.getSalary());

	}

}
