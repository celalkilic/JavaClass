package week6monday;

public class MethodConcept {
	// void method == no return
	public static void newLine() {
		System.out.println();
	}
	
	// void method == no return
	public static void threeLine() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static String google() {
		return "Google is a company in California";
	}
	
	public String kaplan() {
		return "Kaplan is a language school";
	}

	public static void main(String[] args) {
		MethodConcept mc = new MethodConcept();
		System.out.println(mc.kaplan());
		
		String company = google();
		System.out.println(company);
		
		newLine();
		System.out.println("First Line");
		threeLine();
		System.out.println("Fifth Line");

	}

}
