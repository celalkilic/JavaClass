package week8monday;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("Alan", "Turung", 1123456, "5468752");
		employee.setiD(852);
		System.out.println("first name : " + employee.getName());
		System.out.println("lastname : "+ employee.getLastName());
		System.out.println("employee id : "+ employee.getiD());
		System.out.println("***********************");
		Employee employee2 = new Employee();
		employee2.setName("celal");
		employee2.setLastName("kilicarslan");
		employee2.setiD(789);
		employee2.setsSN("789542");
		System.out.println(employee2.getName());
		System.out.println(employee2.getLastName());
		System.out.println(employee2.getiD());
		System.out.println(employee2.getsSN());
		
	}

}
