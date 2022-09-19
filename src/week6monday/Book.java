package week6monday;

import java.util.ArrayList;

public class Book {
	public int id;
	public String name;
	public String author;
	public ArrayList<String> reviews = new ArrayList<>();
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public Book() {
		this.id = 0;
		this.name = "default-name";
		this.author = "default-author-name";
	}
	/**
	 * This method adds reviews for the book object
	 * 
	 * @param review
	 */
	public void addReview(String review) {
		reviews.add(review);
	}
	public void printReviews() {
		for (int i = 0; i < reviews.size(); i++) {
			System.out.println(reviews.get(i));
		}
	}
	public void printInformation() {
		System.out.println("Book id " + id);
		System.out.println("Book name " + name);
		System.out.println("Book author " + author);
	}

}
