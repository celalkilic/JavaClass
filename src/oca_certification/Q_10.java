package oca_certification;


public class Q_10{
	
	static int numberOfObjects;
	
	public Q_10() {
		numberOfObjects++;
	}
	
	public Q_10(int a) {
		numberOfObjects++;
	}
	public Q_10(String s) {
		numberOfObjects++;
	}

	public static void main(String[] args) {

		Q_10 obj1 = new Q_10();
		Q_10 obj2 = new Q_10(8);
		Q_10 obj3 = new Q_10("Ali");
		obj1.equals(obj3);
		obj2.equals(obj3);
		System.out.println("Number of Object: " + numberOfObjects);
		
	}

}