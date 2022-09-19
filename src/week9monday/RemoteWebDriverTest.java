package week9monday;
// non-static field can not be used in static method
public class RemoteWebDriverTest {
	static RemoteWebDriver driver;  //composition : classes have field as another classes reference
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.siliconelaps.com");
		driver = new OperaDriver();
		driver.get("https://www.google.com");
		driver.close();
		
		driver = new IEDriver();
		
		driver.get("https://www.amazon.com");
		driver.close();

	}
	
}
