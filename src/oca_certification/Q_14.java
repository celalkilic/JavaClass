package oca_certification;

import java.util.Scanner;

public class Q_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int k = 0; 
		double totaltemp = 0;
		double avaragetemp = 0; 
		System.out.println("enter temperatures: "); 
		double temps [ ] = {scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),
		scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),
		scanner.nextDouble(),scanner.nextDouble()}; 
		for (; k < temps.length; k++) {
			totaltemp = totaltemp+temps[k];
		 
		 }
		avaragetemp = totaltemp/temps.length;
		 System.out.println("sicaklik ortalamasi :"+ avaragetemp);
	}

}
