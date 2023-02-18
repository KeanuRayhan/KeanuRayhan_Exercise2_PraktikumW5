package Task2;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CIRCLE");
		/*Deklarasi dan instansiasi dari Circle
		dengan radius, color, dan filled default*/
		Circle c1 = new Circle();
		System.out.println("Circle 1 : "
				+ " Radius = " + c1.getRadius()
				+ ", Area = " + c1.getArea()
				+ ", Perimeter = " + c1.getPerimeter());
		System.out.println(c1.toString());
		
		/*Deklarasi dan instansiasi dari Circle
		radius yang spesifik, dengan color dan filled default */
		Circle c2 = new Circle(2.0);
		System.out.println("\nCircle 2 : "
				+ " Radius = " + c2.getRadius()
				+ ", Area = " + c2.getArea()
				+ ", Perimeter = " + c2.getPerimeter());
		System.out.println(c2.toString());
		
		/*Deklarasi dan instansiasi dari Circle
		dengan radius, color, dan filled yang spesifik*/
		Circle c3 = new Circle(4.0, "yellow", true);
		System.out.println("\nCircle 3 : "
				+ " Radius = " + c3.getRadius()
				+ ", Area = " + c3.getArea()
				+ ", Perimeter = " + c3.getPerimeter());
		System.out.println(c3.toString());
		
		
		System.out.println("\n\nRECTANGLE");
		/*Deklarasi dan instansiasi dari Rectangular
		dengan width, length, color, dan filled default*/
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle 1 : "
				+ " Width = " + r1.getWidth()
				+ ", Length = " + r1.getLength()
				+ ", Area = " + r1.getArea()
				+ ", Perimeter = " + r1.getPerimeter());
		System.out.println(r1.toString());
		
		/*Deklarasi dan instansiasi dari Rectangular
		width dan length yang spesifik, dengan color dan filled default */
		Rectangle r2 = new Rectangle(4.0, 8.0);
		System.out.println("\nRectangle 2 : "
				+ " Width = " + r2.getWidth()
				+ ", Length = " + r2.getLength()
				+ ", Area = " + r2.getArea()
				+ ", Perimeter = " + r2.getPerimeter());
		System.out.println(r2.toString());
		
		/*Deklarasi dan instansiasi dari Rectangular
		dengan width, length, color, dan filled yang spesifik*/
		Rectangle r3 = new Rectangle(5.0, 9.0, "purple", true);
		System.out.println("\nRectangle 3 : "
				+ " Width = " + r3.getWidth()
				+ ", Length = " + r3.getLength()
				+ ", Area = " + r3.getArea()
				+ ", Perimeter = " + r3.getPerimeter());
		System.out.println(r3.toString());
		
		
		System.out.println("\n\nSQUARE");
		/*Deklarasi dan instansiasi dari Square
		dengan side, color, dan filled default*/
		Square s1 = new Square();
		System.out.println("Square 1 : "
				+ " Side = " + s1.getSide()
				+ ", Area = " + s1.getArea()
				+ ", Perimeter = " + s1.getPerimeter());
		System.out.println(s1.toString());
		
		/*Deklarasi dan instansiasi dari Square
		side spesifik, dengan color dan filled default*/
		Square s2 = new Square(8.0);
		System.out.println("\nSquare 2 : "
				+ " Side = " + s2.getSide()
				+ ", Area = " + s2.getArea()
				+ ", Perimeter = " + s2.getPerimeter());
		System.out.println(s2.toString());
		
		/*Deklarasi dan instansiasi dari Square
		dengan side, color, dan filled yang spesifik*/
		Square s3 = new Square(12.0, "blue", true);
		System.out.println("\nSquare 3 : "
				+ " Side = " + s3.getSide()
				+ ", Area = " + s3.getArea()
				+ ", Perimeter = " + s3.getPerimeter());
		System.out.println(s3.toString());

	}

}
