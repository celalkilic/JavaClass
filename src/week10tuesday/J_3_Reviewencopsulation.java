package week10tuesday;

class Costumer{
	private int age;
	private String nameString;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
}
public class J_3_Reviewencopsulation {

	public static void main(String[] args) {
		Costumer obj =new Costumer();
		obj.setAge(20);
		obj.setNameString("celal");
		System.out.println(obj.getAge()+ " "+obj.getNameString());
	}

}
