package week8tuesday;

class AAA{
	int i = 10;
	void method() {
		System.out.println("Europe");
	}
}
class BBB extends AAA {
	int i = 20;
	void method1() {
		System.out.println("USA");
	}
}


public class Googleclassroom2 {

	public static void main(String[] args) {  
		BBB a = new BBB(); 
		a.method1();
    }
}

