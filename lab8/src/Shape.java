public class Shape {
	private String color = "blue";
	private boolean filled;
	private java.util.Date dateCreated;

	
	public Shape() {
		dateCreated = new java.util.Date();
	}

	
	public Shape(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public String getColor() {
		return color;
	}

	
	public void setColor(String color) {
		this.color = color;
	}


	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	}