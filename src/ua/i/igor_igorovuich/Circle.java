package ua.i.igor_igorovuich;

public class Circle extends Shape {

	private Point center;
	private Point a;

	public Circle(Point center, Point a) {
		super();
		this.center = center;
		this.a = a;
	}

	public Circle() {
		super();
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	@Override
	double calculatePerimetr() {
		return 2 * Math.PI * a.getLength(center);
	}

	@Override
	double calculateArea() {
		return Math.PI * Math.pow(a.getLength(center), 2);
	}

	@Override
	public String toString() {
		return "Circle [center = " + center + ", a = " + a + ", Length = " + calculatePerimetr() + ", Area = "
				+ calculateArea() + "]";
	}

}
