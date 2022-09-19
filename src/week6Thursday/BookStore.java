package week6Thursday;
public class BookStore {
	// Finish the example in class work, And complete other buy and return methods
	 static int customerNumber;
	 static int crimeInventory = 100, comicsInventory = 90, biographyInventory = 40;
	 static double pricecimebook = 2.10,pricecomicsbook = 3.10, pricebiographybook = 4.10;
	void buyCrimeBooks(int amount){
		System.out.println("You bought :"+amount+" crime book");
		crimeInventory -= amount;	}
	void returnCrimeBook(int amount){
		System.out.println("You returned :"+ amount +" crime book");
		crimeInventory += amount;}
	void buycomicsBooks(int amount){
		System.out.println("You bought :"+amount+" comics book");
		comicsInventory -= amount;}
	void returncomicsBook(int amount){
		System.out.println("You returned :"+amount+"  comics book");
		comicsInventory += amount;}
	void buybiographyBooks(int amount){
		System.out.println("You bought :"+amount+"  biography book");
		biographyInventory -= amount;}
	void returnbiographyBook(int amount){
		System.out.println("You returned :"+amount+"  biography book");
		biographyInventory += amount;}
	public BookStore() {
		customerNumber++;}
	public static void sumofbook() {
		System.out.println("total crimebook :"+crimeInventory+ " "+
				"\ntotal comicsbook :"+comicsInventory+ " "+
				"\ntotal biographyBooks :"+" "+biographyInventory);}
	public static void calculatelastpayment() {
		System.out.println("you need to pay :"+ "\n for crime books  "+
				pricecimebook*(100-crimeInventory)+"\n for comics books  "+
				pricecomicsbook*(90-comicsInventory)+"\n for biography books  "+
				pricebiographybook*(40-biographyInventory));
	}
	public static void main(String[] args) {
		BookStore customer = new BookStore(), customer2 = new BookStore();
		customer.buyCrimeBooks(10);
		customer.buybiographyBooks(10);
		customer.buycomicsBooks(10);
		customer2.buyCrimeBooks(20);
		customer.returnCrimeBook(10);	
		System.out.println("Customer number : "+BookStore.customerNumber);
		BookStore.sumofbook();
		BookStore.calculatelastpayment();

	}

}
