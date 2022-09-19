package week10tuesday;

import java.util.ArrayList;
import java.util.function.Consumer;

public class J_8_LambdaExpressionAsParasmeter {

	public static void main(String[] args) {
		ArrayList<Integer>numbers = new ArrayList();
		numbers.add(4298);
		numbers.add(4299);
		numbers.add(4300);
		numbers.add(4305);
		numbers.add(4306);
		
		numbers.forEach(num-> System.out.println(num)); 
		//or
		Consumer<Integer> obj = (n) -> {System.out.println(n);};
		
		numbers.forEach(obj);

	}

}
