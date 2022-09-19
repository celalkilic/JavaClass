package oca_certification;


public class Q_9 {

	public static void main(String[] args) {
		// how to find duplicate elements in the java array
		Integer arr [] = {4298,4299,4300,4301,4298};
		String arr2 [] = {"String", "Integer", "String", "Float"};
		findDuplicate(arr2);
		findDuplicate(arr);
		
	}
	
		static void findDuplicate(Object arr[]){
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i].equals(arr[j])) {
						System.out.println("this elements written as duplicate : "+arr[i]);
					}
				}
			}
		}
}