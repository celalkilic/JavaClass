package week10tuesday;
class superClass{
	int number;

	public superClass(int number) {
		this.number = number;
	}
	
}
class subClass{
	int a;

	public subClass(int a, int number) {
		super();
		this.a = a;
	}
	
	
}
public class J_2_Review {

	public static void main(String[] args) {
		subClass objClass= new subClass(10,30);

	}

}
