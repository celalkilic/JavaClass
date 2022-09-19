package oca_certification;

import java.util.Random;

public class Q_4 {

	public static void main(String[] args) {
		// 1) Random class for generating random numbers
		
		Random random = new Random();
				
		//give the upperbound as a parameter
		System.out.println(random.nextInt(3));
				
				
		// 2) 
		System.out.println(new Random().nextInt(10)); // 0- upperbound
		System.out.println(new Random().nextDouble()); // 0-1
				
				
				
		// 3) Math.random() : Generates numbers from 0-1 double values
				
		System.out.println((int)(Math.random()*10));

	}

}
