package week7monday;

public class Employeetest {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Alan", "Turing", 01, "567870960");
		System.out.println("First name: " + employee.getFirstName());
		System.out.println("Last name: " + employee.getLastName());
		System.out.println("ID number: " + employee.getId());
		System.out.println("Employee SSN: " + employee.getSSN());
		
		System.out.println("\n");
		Employee employee2 = new Employee();
		employee2.setFirstName("John");
		employee2.setLastName("Sweeney");
		employee2.setId(02);
		employee2.setSSN("657392032");
		
		System.out.println("First name: " + employee2.getFirstName());
		System.out.println("Last name: " + employee2.getLastName());
		System.out.println("ID number: " + employee2.getId());
		System.out.println("Employee SSN: " + employee2.getSSN());
		
	}

}
