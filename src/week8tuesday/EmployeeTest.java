package week8tuesday;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee(),
				employee2 = new Employee(),
				employee3 = new Employee();
		employee1.setName("ahmet");
		employee2.setName("talha");
		employee3.setName("suzan");
		
		employee1.setSalary(1000);
		employee2.setSalary(1200);
		employee3.setSalary(1300);
		
		employee1.setProfession("tester");
		employee2.setProfession("developer");
		employee3.setProfession("datascientist");
		
		String [] nameOfEmp = {employee1.getName(),employee2.getName(),employee3.getName()};
		int [] salaryOfEmp = {employee1.getSalary(),employee2.getSalary(),employee3.getSalary()};
		String [] professionOfEmp = {employee1.getProfession(),employee2.getProfession(),employee3.getProfession()};
		
		System.out.println(employee1.getSalary());
		System.out.println(nameOfEmp[0]+" "+nameOfEmp[1]+" "+nameOfEmp[2]);
		System.out.println(salaryOfEmp[0]);
		System.out.println(professionOfEmp[0]);
	}

}
