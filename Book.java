package Exceptions;

public class Book {

	
	
	private int memberId;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	
	public Book() {}
	public Book(int memberId, String name, String author, String publisher, int quantity) {
		this.memberId = memberId;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Book [memberId=" + memberId + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", quantity=" + quantity + "]";
	
	}
}
