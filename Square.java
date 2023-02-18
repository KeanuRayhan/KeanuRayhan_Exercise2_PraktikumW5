package Task2;

public class Square extends Rectangle {
	
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return this.width;
	}
	
	public void setSide(double side) {
		this.width = this.length = side;
	}
	
	@Override
	public void setWidth(double side) {
		this.width = side;
	}
	
	@Override
	public void setLength(double side) {
		this.length = side;
	}
	
	@Override
	public double getArea() {
		return this.width * this.length;
	}
	
	@Override
	public double getPerimeter() {
		return 4 * this.width;
	}
	
	@Override
	public String toString() {
		return "A Square with side = " + this.length + ", which is a subclass of " + super.toString();
	}
	

}
