package week8saturday;
class X
{
	int method(int i, int d)
	{
		return i+d;
	}
	static int method(int i, double d)
	{
		return (int)(i+d);
	}
	double method(double i, int d)
	{
		return i+d;
	}
	static double method(double i, double d)
	{
		return i+d;
	}
}

public class Question6 {

	public static void main(String[] args) {
		X refX = new X();
		System.out.println(refX.method(8, 2));
		

	}

}
