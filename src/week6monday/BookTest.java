package week6monday;

public class BookTest {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "Python for Finance", "Thomas Wiley");
		book1.printInformation();
		book1.addReview("Great Book!");
		book1.addReview("Awesome book");
		book1.addReview("Boring book");
		book1.printReviews();
		
		Book book2 = new Book();
		book2.printInformation();


	}

}
