package week7monday;

public class Employee {

	private String firstName;
	private String lastName;
	private int id;
	private String SSN;
	
	public Employee(String firstName, String lastName, int id, String SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.SSN = SSN;
	}
	public Employee() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}


}
