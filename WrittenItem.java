package training;

public abstract class WrittenItem extends item {
	private String author;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
class Book extends WrittenItem{
	String athr;
	Book(String author){
		setAuthor(author);
		athr=getAuthor();
	}
	public void checkin()
	{
		System.out.println("Book Checkin......."+ athr);
	}
	public void checkout()
	{
		System.out.println("Book Checkout.....");
	}
	public void additem() {
		System.out.println("adding book item");
	}
	
}

class JournalPaper extends WrittenItem{
	
	private int year_published;
	
	public void checkin()
	{
		System.out.println("paper Checkin.......");
	}
	public void checkout()
	{
		System.out.println("paper out");
	}
	
	public void additem()
	{
		System.out.println("paper item added");
	}
	public void getyear(int year_published) {
		this.year_published=year_published;
		
	}
	public int setyear() {
		return year_published;
	}
	
} 