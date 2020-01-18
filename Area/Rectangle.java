package Area;

public class Rectangle extends Shape {
	protected double a;
	protected double b;

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getArea() {
		return a*b;
	}
	
	public double getPerimeter() {
		return 2*a + 2*b;
	}

}
