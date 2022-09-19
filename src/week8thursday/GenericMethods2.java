package week8thursday;

public class GenericMethods2 {
	static <E> String [] convertor(E ...element){
		String [] arr = new String[element.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = " "+element[i];
		}
		return arr;
	}
	public static void main(String[] args) {
		Integer [ ] integer = {1,2,3,4};
		Double [] doubles = {1.2,2.1,3.1,5.3};
		System.out.println(convertor(integer)[0]);
		System.out.println(convertor(doubles)[2]);

	}

}
