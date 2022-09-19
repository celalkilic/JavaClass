package week7Tuesday;
class parent{
	void speaks() {
		System.err.println("do your homework");
	}
}
class child extends parent{
	void spaeaks() {
		System.out.println("ok mom");
	}
}
public class InheritanceConceptOverriding {

	public static void main(String[] args) {
		child refChild = new child();
		refChild.spaeaks();
	}

}
