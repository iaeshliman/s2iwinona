package S2I_Library;

public abstract class Item {
	protected String title;
	protected String date;
	protected String publisher;
	protected String genre;
	
	public Item(String ti, String dt, String pu, String g) {
		this.title = ti;
		this.date = dt;
		this.publisher= pu;
		this.genre = g;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString() {
		return "title= " + title + ", date= " + date;
	}

}
