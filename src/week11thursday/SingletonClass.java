package week11thursday;

public class SingletonClass {
	public static void main(String[] args) {
		LazySingleton obj = LazySingleton.getInstance();
		LazySingleton obj2 = LazySingleton.getInstance();
		LazySingleton obj3 = LazySingleton.getInstance();
		obj.message = "HIII";
		System.out.println(obj.message);
		System.out.println(obj2.message);
		System.out.println(obj3.message);
				
	}
}
// Singleton class is a class design that only one object can be instantiated from.
class LazySingleton{
	private static LazySingleton instance;
	public String message;
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance(){
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}