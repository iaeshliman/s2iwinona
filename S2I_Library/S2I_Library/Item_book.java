package S2I_Library;

public class Item_book extends Item{

	protected String author;
	protected int pages;
	protected double level;

	public Item_book(String ti, String dt, String pu, String g, String au, int pg, double lvl) {
		super(ti, dt, pu, g);
		this.author = au;
		this.pages = pg;
		this.level = lvl;
		
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getLevel() {
		return level;
	}
	public void setLevel(double level) {
		this.level = level;
	}
}
