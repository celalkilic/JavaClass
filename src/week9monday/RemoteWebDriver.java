package week9monday;
//Abstract classes can have abstract method(method without body)
//Overriding : creating a method in subclass which occurs in the same header in superclass.
//why we use overriding : to provide specific implementation in the subclass.
abstract public class RemoteWebDriver {
	
	abstract void get(String URL);
	abstract void close();
}
class IEDriver extends RemoteWebDriver{
	@Override
	void get(String URL) {
		System.out.println("Opening " + URL + " in IE Driver...");
		
	}
	@Override
	void close() {
		System.out.println("Closing IE Driver...");
		
	}
	
	
}
class ChromeDriver extends RemoteWebDriver{
	@Override
	void get(String URL) {
		System.out.println("Opening " + URL + " in Chrome Driver...");
		
	}
	@Override
	void close() {
		System.out.println("Closing Chrome Driver...");
		
	}
	
	
}
class OperaDriver extends RemoteWebDriver{
	@Override
	void get(String URL) {
		System.out.println("Opening " + URL + " in Opera Driver...");
		
	}
	@Override
	void close() {
		System.out.println("Closing Opera Driver...");
		
	}
	
	
}
