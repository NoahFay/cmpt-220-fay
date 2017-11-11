public class Object {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;


	public Object() {
		dateCreated = new java.util.Date();
	}


	public Object(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	//1st color
	public String getColor() {
		return color;
	}

	//new color
	public void setColor(String color) {
		this.color = color;
	}

	//filled
	public boolean isFilled() {
		return filled;
	}

	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// makes date
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	//gets string
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
			" and filled: " + filled;
	}
}