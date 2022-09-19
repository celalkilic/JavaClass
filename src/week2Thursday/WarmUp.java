package week2Thursday;

public class WarmUp {

	public static void main(String[] args) {
		
		// Switch Case - String Class
		
		int key = 10;
		String name = "Silicone Labs";
		
		switch (key) {
		case 9:
			name = name.toUpperCase();
			System.out.println(name);
			break;
		case 4:
			name = name.toLowerCase();
			System.out.println(name);
			break;
		default:
			name = name.substring(0,8);
			System.out.println(name);
			break;
		}
		
		System.out.println(name.length());
		
		

	}

}
