public abstract class Object {
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;

//object squar oct circle
	protected Object() {
		dateCreated = new java.util.Date();
	}

	
	protected Object(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	//color
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	//if filled 
	public boolean isFilled() {
		return filled;
	}


	public void setFilled(boolean filled) {
		this.filled = filled;
	}
//date
	public java.lang.Object getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}

//math
	public abstract double getArea();

	
	public abstract double getPerimeter();


	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
}