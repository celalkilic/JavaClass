package week8thursday;

import java.util.Arrays;

public class GenericMethods {
	// Generic methods can be used to have different data types in the parameter
		// E can be all kinds of data type
		static <E> void print(E element){
			System.out.println(element +" : "+ element.getClass().getName());
			
		}
		static <E> void collect(E... elements){
			System.out.println(Arrays.toString(elements));
		}
	public static void main(String[] args) {
		print("String");
		print(44);
		print(true);
		
		collect(4,"String",true, 4.5f);

	}

}
