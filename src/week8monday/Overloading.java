package week8monday;

public class Overloading {
	// method overloading using same method name but different parameters
	public void login() {
		System.out.println("0 parameters login method");
	}
	public void login(String username) {
		System.out.println("login with "+ username);
	}
	public void login(String username, String password) {
		System.out.println("login with "+username+ ":"+password);
	}
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.login();
		obj.login("admin");
		obj.login("admin", "admin123");

	}

}
