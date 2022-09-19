package week10saturday;

import java.util.*;

public class Main {
  public static void main(String[] args) {
	  DrinkVendingMachine  drinkVendingMachine = new DrinkVendingMachine(
				new Drink("Iced Coffee",4.50,10),
              new Drink("Iced Tea",2.50,5),
              new Drink("Smart Water",4.0,20),
              new Drink("Coke",2.30,13) );
		
		drinkVendingMachine.select(1);
		drinkVendingMachine.pay(3);
		System.out.println(drinkVendingMachine.returnChange());
		System.out.println(drinkVendingMachine.current.getQuantity());
		drinkVendingMachine.cancel();
		
		drinkVendingMachine.select(4);
		System.out.println("Amount to pay " + drinkVendingMachine.pay(1.8));
		System.out.println("Coke Quantity " + drinkVendingMachine.current.getQuantity());
		System.out.println("Amount to pay " + drinkVendingMachine.pay(1));
		System.out.println(drinkVendingMachine.returnChange());
		System.out.println("Coke Quantity " + drinkVendingMachine.current.getQuantity());
  
   
  }
}
