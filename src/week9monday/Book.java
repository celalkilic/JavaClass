package week9monday;

public class Book {
	String bookName;
	int pageNumber;
	String author;
	
	public Book(String bookName, int pageNumber, String author) {
		super();
		this.bookName = bookName;
		this.pageNumber = pageNumber;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
