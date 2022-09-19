package week8monday;

public class Employee {

	private String name;
	private String lastName;
	private int iD;
	private String sSN;
	
	public Employee(String name, String lastName, int iD, String sSN) {
		this.name = name;
		this.lastName = lastName;
		this.iD = iD;
		this.sSN = sSN;
	}
	

	public Employee() {
		this.name = name;
		this.lastName = lastName;
		this.iD = iD;
		this.sSN = sSN;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getiD() {
		return iD;
	}


	public void setiD(int iD) {
		this.iD = iD;
	}


	public String getsSN() {
		return sSN;
	}


	public void setsSN(String sSN) {
		this.sSN = sSN;
	}
}
