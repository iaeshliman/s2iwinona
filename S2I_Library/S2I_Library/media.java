package S2I_Library;

public class media extends Item {
	
	protected double length;
	protected String rating;
	
	public media(String ti, String dt, String pu, String g, double length, String rt) {
		super(ti, dt, pu, g);
		this.length = length;
		this.rating = rt;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
}
