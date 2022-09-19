package week10tuesday;
@FunctionalInterface
interface IOdd{
	boolean isOdd(int a);

}
public class Claaswork10tuesday1 {

	public static void main(String[] args) {
		
		IOdd refIOdd = (a) -> {
			if (a%2 != 0) {
				return true;
			}else
				return false;
		};
		
		System.out.println(refIOdd.isOdd(4));
		System.out.println(refIOdd.isOdd(3));



		

	}

}
