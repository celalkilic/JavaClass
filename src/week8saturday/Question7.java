package week8saturday;
class W
{
	void calculate(int a, int b)
	{
		System.out.println("Class X");
	}
}

class Y extends W
{
	@Override
	void calculate(int a, int b)
	{
		System.out.println("Class Y");
	}
}

class Z extends Y
{
	@Override
	void calculate(int a, int b) 
	{
		System.out.println("Class Z");
	}
}

public class Question7 {

	public static void main(String[] args) {
		W x = new Y();
		
		x.calculate(10, 20);
		
		Y y = new Y() ;
		
		y.calculate(50, 100);
		
		Z z = new Z();
		
		z.calculate(100, 200);


	}

}
