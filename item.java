package training;

public abstract class item {
	private int unique_identification,number_copies;
	private String title;
	public abstract void checkin();
	public abstract void checkout();
	public abstract void additem();
	public item() {
		
	}
	public void setnumber_copies(int number_copies) {
		this.number_copies=number_copies;
		
	}
	public int getnumber_copies() {
		return number_copies;
	}
	public void setunique_identification(int unique_identification) {
		this.unique_identification=unique_identification;
	}
	public int getunique_identification()
	{
		return unique_identification;
	}
	public void settitle(String title) {
		this.title=title;
	}
	public String gettitle() {
		return title;
	}
	

	public static void main(String[] args) {
		item it=new Book("Tushar");
		it.checkin();
		
		
		
	
		

	}

}
