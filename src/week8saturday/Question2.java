package week8saturday;

class AA{
	public AA(){
		System.out.println("Class A Constructor");
	}
}
class BB extends AA{
	public BB()
	{
		System.out.println("Class B Constructor");
	}
}
class CC extends BB{
	public CC()
	{
		System.out.println("Class C Constructor");
	}
}

public class Question2 {

	public static void main(String[] args) {
		CC c = new CC();
		

	}

}
