package week9monday;

public class Library {
	String name;
	Book book; //Composition : has a relationship
	
	public Library(String name, Book book) {
		this.name = name;
		this.book = book;
	}

	public static void main(String[] args) {
		Book book = new Book("Algorithmic Trading", 300, "Sebastian donadio");
		System.out.println(book.author);
		System.out.println(book.bookName);
		System.out.println(book.pageNumber);
		Library library = new Library("Public library", book);
		System.out.println(library.book);

		
		

	}

}
