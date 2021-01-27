package S2I_Library;

public class newspaper extends Item {
	
	protected String location;
	protected int pages;
	
	public newspaper(String ti, String dt, String pu, String g, String location, int pages) {
		super(ti, dt, pu, g);
		this.location = location;
		this.pages = pages;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}	
