package week7thursday;

import java.util.ArrayList;
import java.util.Arrays;

import week4Tuesday.forLooprecap;

class Book{
	String title;
	String author;
	public Book(String tite,String author) {
		this.title = tite;
		this.author = author;
		
	}
}
class BookStore{
	ArrayList<Book> booklist = 
			 new ArrayList<Book>(Arrays.asList(new Book("Angels and Demons", "Dan Brown"),
					 new Book("fm and I", "Anthony")));
	void BuyBook(String name) {
		for (Book book : booklist) {
			if (book.title.equals(name)) {
				System.out.println(name + " "+" is avaliable now");
				break;


			}
		}
	}
}
public class Compisition2 {

	public static void main(String[] args) {
		BookStore obj = new BookStore();
		obj.BuyBook("fm and I");

	}

}
