package week7monday;

public class Methodconcept {
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
		Methodconcept mc = new Methodconcept();
		System.out.println(mc.kaplan());
		
		String company = google();
		System.out.println(company);
		Methodconcept.google();
		newLine();
		System.out.println("First Line");
		threeLine();
		System.out.println("Fifth Line");

	}

}
