package training;
public abstract class mediaitem extends item{
	
	
}
class video extends mediaitem{
	private String director,genre;
	private int date_released;
	
	public void getdate_released(int date_released) {
		this.date_released=date_released;
	}
	public int setdate_released()
	{
		return date_released;
	}
	public void checkin() {
		System.out.println("video in");
	}
	public void checkout()
	{
		System.out.println("video out");
	}
	
	public void additem()
	{
		System.out.println("video item added");
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
class CD extends mediaitem{
	private String genre,artist;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void checkin() {
		System.out.println("CD in");
	}
	public void checkout()
	{
		System.out.println("CD out");
	}
	
	public void additem()
	{
		System.out.println("CD item added");
	}
	
}

