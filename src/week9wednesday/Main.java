package week9wednesday;

public class Main {

	public static void main(String[] args) {
		Parent obj = new Child1();
		obj.message();
		
		obj = new Child2();
		obj.message();
		
		Parent obj2 = new Child2();
		obj2.message();
		


	}

}
