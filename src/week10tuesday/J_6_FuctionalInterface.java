package week10tuesday;
@FunctionalInterface //annotation
interface FunctInter{
	//functional interfaces can have only one abstract method
	void print();
}
public class J_6_FuctionalInterface {

	public static void main(String[] args) {
		//Anonymous Class
		FunctInter reFunctInter = new FunctInter() {
			
			@Override
			public void print() {
				System.out.println("hello");
				
			}
		};
		reFunctInter.print();
		//lambda expression
		FunctInter reFunctInter2 = () -> {System.out.println("hello world");};
		reFunctInter2.print();
		}
		
	}


