package week8saturday;
//Private --> default --> protected --> public
class CCC{
	protected void name() {
		
	}
	void method() {
		
	}
}
class DDD extends CCC{
	
	void method() {
		super.method();
	}

	public void name() {
//we can do override protected method with public
	}
	
}
public class Qestion9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
