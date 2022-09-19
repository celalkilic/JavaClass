package week7saturday;

public class SomeObject{
	public int propertiy1;
	public String propertiy2;
	
	public SomeObject() {
		this.propertiy1 = 100;
		this.propertiy2 = "string";
	}
	
	
	public static void main(String[] args) {
		SomeObject object = Main2.createObject();
		System.out.println(object.propertiy1);
		System.out.println(object.propertiy2);
	}
	
}
class Main2 {
	public static SomeObject createObject() {
		return new SomeObject();
	}
	

}
