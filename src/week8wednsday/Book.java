package week8wednsday;

public class Book {

	private String name;
	private String ISBN;
	private String author;
	private String publisher;

	public Book(String name, String ISBN, String author, String publisher) {
		this.name = name;
		this.ISBN = ISBN;
		this.author = author;
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBookInfo() {
		String info = "Book name : " + name + "\nAuthor name : " + author + "\nISBN : " + ISBN + "\nPublisher : "
				+ publisher;
		
		return info;
	}
		
	public static void main(String[] args) {
		Book obj = new Book("Head first Java","1-8549-124", "Jamie chan", "O really");
		System.out.println(obj.getBookInfo());
	}

}
