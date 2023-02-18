package Task2;

public class Shape {
	private String color = "red";
	private boolean filled = true;
	
	public Shape() {
		color = "green";
		filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		if(this.filled == true) {
			return "Shape[color = " + this.color + ", " + "filled = filled" + "]";
		} else {
			return "Shape[color = " + this.color + ", " + "filled = Not filled" + "]";
		}

	}

}
