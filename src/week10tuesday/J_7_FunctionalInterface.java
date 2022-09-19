package week10tuesday;
@FunctionalInterface
interface FunctInt2{
	int add(int a, int b);
	
}
@FunctionalInterface
interface LambdaExpression{
	void calculatePower(int a , int b);
}
public class J_7_FunctionalInterface {

	public static void main(String[] args) {
		FunctInt2 ref = (a,b)-> a+b ;
		System.out.println(ref.add(5, 6));
		FunctInt2 ref2 = (a,b)-> {return a+b;};
		System.out.println(ref2.add(8, 7));
		
		LambdaExpression ref3 = (a,b) ->{
			double power = Math.pow(2, 3);
			System.out.println(power);
		};
	}

}
