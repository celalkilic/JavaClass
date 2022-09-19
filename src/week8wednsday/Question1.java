package week8wednsday;
class Employee{
	private String firsName;
	private String lastName;
	private double salary;
	public Employee(String firsName, String lastName, double salary ) {
		this.firsName = firsName;
		this.lastName = lastName;
		if (salary<0) {
			this.salary=0.0;
		}else {
			this.salary = salary;
		}
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary < 0) {
			this.salary = 0.0;
		} else {
			this.salary = salary;
		}
	
}
	
	
	
	
}
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
